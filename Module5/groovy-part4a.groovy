println "\t\t\tTRUTH TABLES\t\t\t"
println "#####################################################"
println "\n"
println "A\t\tB\t\t\tA && B"
println "-----------------------------------------------------"
println "False\t\tFalse\t\t\t${false && false}"
println "True\t\tFalse\t\t\t${true && false}"
println "False\t\tTrue\t\t\t${false && true}"
println "True\t\tTrue\t\t\t${true && true}"
println "-----------------------------------------------------"
println "\n"


println "A\t\tB\t\t\tA || B"
println "-----------------------------------------------------"
println "False\t\tFalse\t\t\t${false || false}"
println "True\t\tFalse\t\t\t${true || false}"
println "False\t\tTrue\t\t\t${false || true}"
println "True\t\tTrue\t\t\t${true || true}"
println "-----------------------------------------------------"

println "\n"

println "A\t\t !A"
println "-----------------------------------------------------"
println "False\t\t${!false}"
println "True\t\t${!true}"
println "-----------------------------------------------------"