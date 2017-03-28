염기쌍 = {'A':'T', 'G':'C', 'T':'A', 'C':'G'}
한쪽 = 'AAACCCTTGGAATTCCGG'
반대쪽 = ''
for 염기 in 한쪽:
	반대염기 = 염기쌍[염기]
	반대쪽 = 반대쪽 + 반대염기
print(한쪽)
print(반대쪽)