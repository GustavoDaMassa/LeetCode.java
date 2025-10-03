# Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


---

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

---

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

---

# Two Sum (Soma de Dois)

Dada uma array de inteiros `nums` e um inteiro `target`, retorne os índices dos dois números de forma que a soma deles seja igual a `target`.

Você pode assumir que cada entrada terá exatamente uma solução, e você não pode usar o mesmo elemento duas vezes.

Você pode retornar a resposta em qualquer ordem.


---

Exemplo 1:

Entrada: nums = [2,7,11,15], target = 9
Saída: [0,1]
Explicação: Porque nums[0] + nums[1] == 9, retornamos [0, 1].
Exemplo 2:

Entrada: nums = [3,2,4], target = 6
Saída: [1,2]
Exemplo 3:

Entrada: nums = [3,3], target = 6
Saída: [0,1]

---

Restrições:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Existe apenas uma resposta válida.


Acompanhamento: Você consegue criar um algoritmo com complexidade de tempo menor que O(n^2)?