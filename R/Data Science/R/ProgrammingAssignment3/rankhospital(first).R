rankhospital <- function(state, outcome, num = "best") {
        data <- read.csv("outcome-of-care-measures.csv")
        if (! state %in% data[, "State"]) {
                stop("invalid state")
        }
        if (outcome == "heart attack") {
                col <- 11
        } else if (outcome == "heart failure") {
                col <- 17
        } else if (outcome == "pneumonia") {
                col <- 23
        } else {
                stop("invalid outcome")
        }
        
        state_data <- data[data$State == state, ]
        if (num == "best") { num <- 1}
        if (num == "worst") { num }
        if (class(num) == "numeric") {
                if (num > length(state_data)) { return(NA)}
        }
        
        Raw <- as.numeric(as.character(state_data[, col]))
        if (num == "worst") { num <- length(sort(Raw))}
        rate <- format(round(sort(Raw)[num], 1), nsmall = 1)
        hospital_factor <- state_data[state_data[, col] == rate, ]$Hospital.Name
        hospital <- sort(as.character(hospital_factor))
        
} 