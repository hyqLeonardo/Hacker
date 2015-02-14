rankall <- function(outcome, num = "best") {
        data <- read.csv("outcome-of-care-measures.csv")
        if (outcome == "heart attack") {
                col <- 11
        } else if (outcome == "heart failure") {
                col <- 17
        } else if (outcome == "pneumonia") {
                col <- 23
        } else {
                stop("invalid outcome")
        }
        
        frame <- data.frame()
        state_list <- levels(data[, "State"])
        
        for(i in 1:length(state_list)) {
                
                state = state_list[i]
                state_data <- data[data$State == state, ]
                Raw <- as.numeric(as.character(state_data[, col]))
                
                if (class(num) == "numeric") {
                        if (num > length(sort(Raw))) { 
                                hospital <- "NA"
                                frame_part <- data.frame(hospital, state)
                        }
                        else {
                                rate <- format(round(sort(Raw)[num], 1), nsmall = 1)
                                hospital_factor <- state_data[state_data[, col] == rate, ]$Hospital.Name
                                hospital <- sort(as.character(hospital_factor))
                                frame_part <- data.frame(hospital, state)
                        }
                } else {
                            if (num == "worst") { 
                                    NUM <- length(sort(Raw)) ## Be careful ! Must give the number  to 
                            }else if (num == "best") { num <- 1} ## a new variable "NUM"
                            
                            rate <- format(round(sort(Raw)[NUM], 1), nsmall = 1)
                            hospital_factor <- state_data[state_data[, col] == rate, ]$Hospital.Name
                            hospital <- sort(as.character(hospital_factor))
                            frame_part <- data.frame(hospital, state)
                            
                }
                                                
                
                frame <- rbind(frame, frame_part)
        }
        frame
} 
## Finally I got it !! But this function looks horrify and there must be 
## some better way to optimze this.  >>>