echo "Enter a number:  "
read num
result=0
rev=0
while [ $num -gt 0 ]
do
    result=$(( $num % 10 ))
    rev=$(( $rev * 10 + $result ))
    num=$(( $num / 10 ))
done
echo "Reverse number of entered digit is $rev"