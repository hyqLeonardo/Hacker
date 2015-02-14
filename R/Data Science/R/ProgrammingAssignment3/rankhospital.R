rankhospital <- function(state, outcome, num) {
  data <- read.csv("outcome-of-care-measures.csv")
  
  if (!state %in% data[, "State"]) {stop("invalid state")}
  
  if (outcome == "heart attack") {
    out <- 11
  } else if (outcome == "heart failure") { 
    out <- 17
  } else if (outcome == "pneumonia") {
    out <- 23
  } else {stop("invalid outcome")}
  
  data_state <- data[which(data$State == state), c(2, out)]
  data_state[, 1] <- as.character(data_state[, 1])
  data_state[, 2] <- as.numeric(as.character(data_state[, 2]))
  Data <- na.omit(data_state)
  
  if (num == "best") {
    num <- 1
  } else if (num == "worst") {
    num <- length(Data[, 1])
  } else if (num > length(Data[, 1])) {
    return("NA")
  }
  
  Hospital <- sort(Data[which(Data[, 2] == sort(Data[, 2])[num]), 1])
}