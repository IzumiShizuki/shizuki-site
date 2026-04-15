package de;

import bd.j0;
import java.util.ArrayList;
import vb.x;
import yc.d0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5878b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5879c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5880d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5881a;

    public /* synthetic */ b(int i10) {
        this.f5881a = i10;
    }

    public static String b(yc.h hVar) {
        String strO;
        be.e name = hVar.getName();
        jc.l.d(name, "getName(...)");
        String strM = lc.b.M(name);
        if (!(hVar instanceof q0)) {
            yc.k kVarY = hVar.y();
            jc.l.d(kVarY, "getContainingDeclaration(...)");
            if (kVarY instanceof yc.e) {
                strO = b((yc.h) kVarY);
            } else if (kVarY instanceof d0) {
                be.d dVar = ((j0) ((d0) kVarY)).f2596e.f2744a;
                jc.l.e(dVar, "<this>");
                strO = lc.b.O(be.d.f(dVar));
            } else {
                strO = null;
            }
            if (strO != null && !strO.equals("")) {
                return strO + '.' + strM;
            }
        }
        return strM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [yc.h, yc.k] */
    /* JADX WARN: Type inference failed for: r2v8, types: [yc.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [yc.k] */
    @Override // de.c
    public final String a(yc.h hVar, i iVar) {
        switch (this.f5881a) {
            case 0:
                if (hVar instanceof q0) {
                    be.e name = ((q0) hVar).getName();
                    jc.l.d(name, "getName(...)");
                    return iVar.M(name, false);
                }
                be.d dVarG = ee.e.g(hVar);
                jc.l.d(dVarG, "getFqName(...)");
                return iVar.m(lc.b.O(be.d.f(dVarG)));
            case 1:
                if (hVar instanceof q0) {
                    be.e name2 = ((q0) hVar).getName();
                    jc.l.d(name2, "getName(...)");
                    return iVar.M(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(hVar.getName());
                    hVar = hVar.y();
                } while (hVar instanceof yc.e);
                return lc.b.O(new x(arrayList));
            default:
                return b(hVar);
        }
    }
}
