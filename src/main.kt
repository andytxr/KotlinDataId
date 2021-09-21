import java.util.Scanner;

fun main(args: Array<String>){

    var scan = Scanner(System.`in`)

    val monthExt = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    var verifYear = 0

    print("Enter with the year: ")
    var year = scan.nextInt()

    if(year % 4 ==0)
        if (year%100==0)
            verifYear=year%400

    println()
    print("Enter with the month: ")
    var month = scan.nextInt()

    if(month<1 || month>12){
        do {
            println()
            print("Enter again with the month: ")
            month=scan.nextInt()
        }while(month<1||month>12)
    }

    println()
    print("Enter with the day: ")
    var day= scan.nextInt()

    if(day<1||day>31){
        do {
            println()
            print("Enter again with the month: ")
            day=scan.nextInt()
        }while(day<1||day>31)
    }

    if(verifYear==0 && month==2){
        if (day>29){
            do {
                println()
                print("Enter again with the day: ")
                day=scan.nextInt()
            }while(day>29)
        }
    }
    else if(verifYear!=0 && month==22){
        if (day>28){
            do {
                println()
                print("Enter again with the day: ")
                day=scan.nextInt()
            }while(day>28)
        }
    }

    if(month==4 || month==6 || month == 7 || month==11 && day>30){
        do {
            println()
            print("Enter again with the day: ")
            day=scan.nextInt()
        }while(month==4 || month==6 || month == 7 || month==11 && day>30)
    }

    println()
    print("Day: " + day + " Month: " + monthExt[month-1] + " Year: " + year)
}