
nosim <- 1000
lambda <- 0.2

cfunc <- function(x, n) sqrt(n) * (mean(x) - 1/lambda) / (1/lambda)
dat <- data.frame(
  x = c(
         apply(matrix(rexp(nosim * 40, lambda),
                     nosim), 1, cfunc, 40)
  ),
  size = factor(rep(c(40), rep(nosim, 1))))
g <- ggplot(dat, aes(x = x, fill = size)) + geom_histogram(alpha = .20, binwidth=.3, colour = "black", aes(y = ..density..)) 
g <- g + stat_function(fun = dnorm, size = 2)
g + facet_grid(. ~ size)