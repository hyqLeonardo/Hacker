pollutantmean <- function(directory, pollutant, id = 1:332){
        files <- list.files(directory, full.names = TRUE)
        subset <- data.frame()
        for(i in 1:length(id)){
          subset <- rbind(subset, read.csv(files[id[i]]))
        }
        mean <- mean(subset[, pollutant], na.rm = TRUE)
}