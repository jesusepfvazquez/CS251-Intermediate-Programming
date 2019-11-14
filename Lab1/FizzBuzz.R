numbers <- seq(1,20, 1)
firstNumber <- 3
secondNumber <- 5

matrix_values <- as.data.frame(matrix(nrow = length(numbers), ncol = 5))
colnames(matrix_values) <- c("Number", "Divide3", "Integer3", "Divide5", "Integer5")

for (i in numbers){
    # print(i)
    matrix_values[i,1] <- paste(i)

    matrix_values[i,2] <- i/firstNumber
    matrix_values[i,3] <- as.integer(i/firstNumber) == (i/firstNumber)

    matrix_values[i,4] <- i/secondNumber
    matrix_values[i,5] <- as.integer(i/secondNumber) == (i/secondNumber)

    if (matrix_values[i,3] == "TRUE" & matrix_values[i,5] == "TRUE") {
        print("FizzBuzz")
    }
    else if (matrix_values[i,3] == "TRUE"){
        print("Fizz")
    }
    else if (matrix_values[i,5] == "TRUE"){
        print("Buzz")
    }
    else{
        print(i)
    }
}

