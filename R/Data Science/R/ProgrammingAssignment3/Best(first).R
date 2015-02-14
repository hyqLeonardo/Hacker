best <- function(state, outcome) {
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
        Raw <- as.numeric(as.character(state_data[, col]))
        minimum <- format(round(min(Raw, na.rm = TRUE), 1), nsmall = 1)
        best_factor <- state_data[state_data[, col] == minimum, ]$Hospital.Name
        best <- sort(as.character(best_factor))
}