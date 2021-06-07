# RSA Cipher Decryption
## Description
RSA cipher method works using arithmetic modularity, where two values and a encrypted emssage are given. In this project we biuld a program that decrypts a message using number theory concepts.

## How does it work?
RSA encryption works with two prime value *p, q* and a value *e* that is coprime to the product *(p-1)(q-1)*. Then a message can be encrypted using the equation:

<img src="https://render.githubusercontent.com/render/math?math=C%20=%20M%20^e%20\mod{pq}">

Where *M* is the ASCII value of the letter we want to encrypt.

<br/>
In a similar way the decryption is made. Using the equation:

<img src="https://render.githubusercontent.com/render/math?math=M%20=%20C%20^d%20\mod{pq}">

Where *C* is the encrypted message and *d* is a value relatively prime to *(p-1)(q-1)*, and can be found using the Extended Euclidean Algorithm.


For more information about RSA encryption, follow this [link](https://en.wikipedia.org/wiki/RSA_(cryptosystem)).


## Approach
In this project all the values are given in the [Encrypted Message file](https://github.com/ChrisMolina99/RSA-Decryption/blob/master/Encrypted%20Message.txt). The first three lines contain the values of *p*, *q*, *e* and the last line contains the message. This message is given as a binary string of characters, in which every 40 characters it is contained a number.

![Demo](/screenshots/demo.gif)

## References
- Discrete Mathematics with Applications, 4th Edition 
