corr <- function(directory, threshold = 0) {
        files <- list.files(directory, full.names = TRUE)
        corr <- vector(mode = "numeric")
        count <- 1
        i <- 1
        while(count <= 332) {
                if(complete(directory, id = count)[1, "nobs"] > threshold) {
                        data <- na.omit(read.csv(files[count]))
                        corr[i] <- cor(data[, "sulfate"], data[, "nitrate"])
                }
                i <- i + 1
                count <- count + 1
        }
        corr <- na.omit(corr)
}  ## Oh ~ Yeah ! ! !