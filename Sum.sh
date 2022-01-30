read N
echo "Enter Size: $N"
echo "Enter few numbers"
i=1
sum=0
while [ $i -le $N ]
do
  read n
  sum=$((sum + n))
  i=$((i + 1))
done

echo "Sum the numbers: $sum"