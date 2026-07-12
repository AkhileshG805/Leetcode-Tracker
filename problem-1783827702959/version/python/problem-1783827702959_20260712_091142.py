# Last updated: 7/12/2026, 9:11:42 AM
1class Solution(object):
2    def secondsBetweenTimes(self, startTime, endTime):
3        a,b,c=map(int,startTime.split(":"))
4        a1,b1,c1=map(int,endTime.split(":"))
5        start=a*3600+b*60+c
6        end=a1*3600+b1*60+c1
7        return end-start