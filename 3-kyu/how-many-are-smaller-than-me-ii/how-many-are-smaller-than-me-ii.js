function smaller(nums) {
  const res = Array(nums.length).fill(0);
  const sorted = [...new Set(nums)].sort((a, b) => a - b);
  const map = new Map(sorted.map((v, i) => [v, i + 1]));
  const BIT = Array(nums.length + 2).fill(0);
​
  const update = i => { while (i < BIT.length) BIT[i]++, i += i & -i; };
  const query = i => { let s = 0; while (i > 0) s += BIT[i], i -= i & -i; return s; };
​
  for (let i = nums.length - 1; i >= 0; i--) {
    const idx = map.get(nums[i]);
    res[i] = query(idx - 1);
    update(idx);
  }
  return res;
}
​