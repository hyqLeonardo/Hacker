pollutantmean <- function(directory, pollutant, id){
        pollutantsum <- 0
        for(i in 1:length(id)){
          if(id[i] < 10){
                  num <- paste("00", id[i], sep = "")
          }else if(id[i] >= 10 && id [i] < 100){
                  num <- paste(0, id[i], sep = "")
          }else{
                  num <- id[i]
          }
          dir <- paste(".", directory, paste(num, ".csv", sep = ""), sep = "/")
          data <- read.csv(dir)
          polmean <- mean(data[, pollutant], na.rm = TRUE)
          pollutantsum <- pollutantsum + polmean
        }
        pollutantmean <- pollutantsum/length(id)
}
