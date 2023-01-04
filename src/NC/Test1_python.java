//package NC;
//
//def solution(str):
//        source=list(str)
//        dest=list()
//        find_dup(source,dest)
//
//        return''.join(dest)
//
//
//def find_dup(source,dest):
//        if len(source)==0:
//            return
//
//        dup=list()
//
//        for i in range(len(source)):
//            if source[i]in source[:i]:
//                dup.append(source[i])
//            else:
//                source.sort()
//                dest.append(source[i])
//
//        find_dup(dup,dest)
//
//# str="execute"
//# str="cucumber"
//# str="bbaabd"
//# str="bbaaabbd"
//
//print(solution(str))
