complete <- function(directory, id = 1:332) {
        count <- numeric(length(id))
        files <- list.files(directory, full.names = TRUE)
        for (i in 1:length(id)) {
                count[i] <- nrow(na.omit(read.csv(files[id[i]])))
        }
        result <- data.frame(id = id, nobs = count)
}