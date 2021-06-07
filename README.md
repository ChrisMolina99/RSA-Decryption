# RSA Cipher Decryption
## Description
RSA cipher method works using arithmetic modularity, where two values and a encrypted emssage are given. In this project we biuld a program that decrypts a message using number theory concepts.

## How does it work?
RSA encryption works with two prime value $$p$$, $$q$$ and a value $$e$$ that is coprime to the product $$(p-1)(q-1)$$. Then a message can be encrypted using the equation
$$C = M ^e \mod{pq}$$
Where the $$M$$ is the ASCII value of the letter we want to encrypt.


In a similar way the decryption is made. Using the equation
$$M = C^d \mod{pq}$$
Where $$C$$ is the encrypted message and $$d$$ is a value relatively prime to $$(p-1)(q-1)$$, and can be found using the Extended Euclidean Algorithm.


For more information about RSA encryption, follow this [link](https://en.wikipedia.org/wiki/RSA_(cryptosystem)).


## Approach
In this project all the values are given in the [Encrypted Message file](/"Encrypted Message.txt"). The first three lines contain the values of $$p$$, $$q$$, $$e$$ and the last one contain the message. This message is given as a binary string of characters, in which every 40 characters it is contained a number.


## References
- Discrete Mathematics with Applications, 4th Edition 

