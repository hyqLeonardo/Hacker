data(ToothGrowth)
head(ToothGrowth)

library(ggplot2)
g <- ggplot(ToothGrowth, aes(x = supp, y = len, supp = factor(dose)))
g <- g + geom_point(size =8, pch = 21, fill = "purple", alpha = .5)
g

t.test(len ~ I(relevel(supp, 2)), paired = FALSE, data = data)