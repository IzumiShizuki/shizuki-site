package lh;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12619b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12620a;

    static {
        String str = File.separator;
        jc.l.d(str, "separator");
        f12619b = str;
    }

    public y(i iVar) {
        jc.l.e(iVar, "bytes");
        this.f12620a = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = mh.c.a(this);
        i iVar = this.f12620a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < iVar.d() && iVar.i(iA) == 92) {
            iA++;
        }
        int iD = iVar.d();
        int i10 = iA;
        while (iA < iD) {
            if (iVar.i(iA) == 47 || iVar.i(iA) == 92) {
                arrayList.add(iVar.o(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < iVar.d()) {
            arrayList.add(iVar.o(i10, iVar.d()));
        }
        return arrayList;
    }

    public final y b() {
        i iVar = mh.c.f15170d;
        i iVar2 = this.f12620a;
        if (jc.l.a(iVar2, iVar)) {
            return null;
        }
        i iVar3 = mh.c.f15167a;
        if (jc.l.a(iVar2, iVar3)) {
            return null;
        }
        i iVar4 = mh.c.f15168b;
        if (jc.l.a(iVar2, iVar4)) {
            return null;
        }
        i iVar5 = mh.c.f15171e;
        iVar2.getClass();
        jc.l.e(iVar5, "suffix");
        int iD = iVar2.d();
        byte[] bArr = iVar5.f12573a;
        if (iVar2.m(iD - bArr.length, iVar5, bArr.length) && (iVar2.d() == 2 || iVar2.m(iVar2.d() - 3, iVar3, 1) || iVar2.m(iVar2.d() - 3, iVar4, 1))) {
            return null;
        }
        int iK = i.k(iVar2, iVar3);
        if (iK == -1) {
            iK = i.k(iVar2, iVar4);
        }
        if (iK == 2 && f() != null) {
            if (iVar2.d() == 3) {
                return null;
            }
            return new y(i.p(iVar2, 0, 3, 1));
        }
        if (iK == 1) {
            jc.l.e(iVar4, "prefix");
            if (iVar2.m(0, iVar4, iVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || f() == null) {
            return iK == -1 ? new y(iVar) : iK == 0 ? new y(i.p(iVar2, 0, 1, 1)) : new y(i.p(iVar2, 0, iK, 1));
        }
        if (iVar2.d() == 2) {
            return null;
        }
        return new y(i.p(iVar2, 0, 2, 1));
    }

    public final y c(y yVar) {
        jc.l.e(yVar, "other");
        i iVar = yVar.f12620a;
        int iA = mh.c.a(this);
        i iVar2 = this.f12620a;
        y yVar2 = iA == -1 ? null : new y(iVar2.o(0, iA));
        int iA2 = mh.c.a(yVar);
        if (!jc.l.a(yVar2, iA2 != -1 ? new y(iVar.o(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + yVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = yVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && jc.l.a(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && iVar2.d() == iVar.d()) {
            return g5.w.v(".");
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(mh.c.f15171e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + yVar).toString());
        }
        if (jc.l.a(iVar, mh.c.f15170d)) {
            return this;
        }
        f fVar = new f();
        i iVarC = mh.c.c(yVar);
        if (iVarC == null && (iVarC = mh.c.c(this)) == null) {
            iVarC = mh.c.f(f12619b);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            fVar.X(mh.c.f15171e);
            fVar.X(iVarC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            fVar.X((i) arrayListA.get(i10));
            fVar.X(iVarC);
            i10++;
        }
        return mh.c.d(fVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        jc.l.e(yVar, "other");
        return this.f12620a.compareTo(yVar.f12620a);
    }

    public final y d(String str) {
        jc.l.e(str, "child");
        f fVar = new f();
        fVar.k0(str);
        return mh.c.b(this, mh.c.d(fVar, false), false);
    }

    public final Path e() {
        Path path = Paths.get(this.f12620a.s(), new String[0]);
        jc.l.d(path, "get(...)");
        return path;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && jc.l.a(((y) obj).f12620a, this.f12620a);
    }

    public final Character f() {
        i iVar = mh.c.f15167a;
        i iVar2 = this.f12620a;
        if (i.g(iVar2, iVar) != -1 || iVar2.d() < 2 || iVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) iVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f12620a.hashCode();
    }

    public final File toFile() {
        return new File(this.f12620a.s());
    }

    public final String toString() {
        return this.f12620a.s();
    }
}
