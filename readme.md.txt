To get list of all palindromes : 
CURL : curl -X GET --header 'Accept: */*' 'http://localhost:8080/palindrome'

To Check the longest palindrome in a given string and store : 
CURL : curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d 'abcd abcdcba aba test' 'http://localhost:8080/palindrome' 

To get palindrome by id
curl -X GET --header 'Accept: application/json' 'http://localhost:8080/palindrome/s3LeBECETCKxKrYOjswcFQ'