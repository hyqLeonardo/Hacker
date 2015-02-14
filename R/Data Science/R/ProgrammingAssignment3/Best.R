best <- function(state, outcome) {
  data <- read.csv("outcome-of-care-measures.csv")
  
  if (!state %in% data[, "State"]) {stop("invalid state")}
  
  if (outcome == "heart attack") {
    out <- 11
    } else if (outcome == "heart failure") { 
      out <- 17
    } else if (outcome == "pneumonia") {
      out <- 23
    } else {stop("invalid outcome")}
  
  data_state <- data[which(data$State == state), c(2, out)]   # "2" means data_state$State, it's better this way. 
  data_state[, 1] <- as.character(data_state[, 1])
  data_state[, 2] <- as.numeric(as.character(data_state[, 2]))
  hospital <- sort(data_state[which(data_state[, 2] == min(data_state[, 2], na.rm = TRUE)), 1])
}  


# Don't forget to change "factor" to "numeric", as.character should be used first !
# After which, min() function should set "na.rm = TRUE".