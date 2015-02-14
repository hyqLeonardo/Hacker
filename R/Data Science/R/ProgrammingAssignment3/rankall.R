rankall <- function(outcome, num) {
  data <- read.csv("outcome-of-care-measures.csv")
  
  if (outcome == "heart attack") {
    out <- 11
  } else if (outcome == "heart failure") { 
    out <- 17
  } else if (outcome == "pneumonia") {
    out <- 23
  } else {stop("invalid outcome")}
  
  state_name <- levels(data$State)
  Hospital <- data.frame(hospital = factor(), state = factor(), rate = numeric())
  
  
  for (i in 1:length(state_name)) {
    Data <- data[which(data$State == state_name[i]), c(2, 7, out)]
    names(Data) <- c("hospital", "state", "rate")
    Data[, 3] <- as.numeric(as.character(Data[, 3]))
    Data <- na.omit(Data)
    
    if (num == "best") {
      index <- 1
    } else if (num == "worst") {
      index <- length(Data[, 1])
    } else if (num < length(Data[, 1])) {
      index <- num
    } else {
      index <- 0
    }
    
    if (!index == 0) {
      Hospital <- rbind(Hospital, Data[which(Data[, 3] == sort(Data[, 3])[index]), ])
    } else {
      Hospital <- rbind(Hospital, list(hospital=as.factor("NA"), state=as.factor(state_name[i]), rate=as.numeric("NA")))
    }
  }
  Hospital <- Hospital[order(Hospital[, 2], Hospital[, 1]), 1:2]
}
  
  