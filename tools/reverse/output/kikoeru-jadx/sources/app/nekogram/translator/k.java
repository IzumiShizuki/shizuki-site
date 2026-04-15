package app.nekogram.translator;

import b7.b1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1119b = 0;

    @Override // app.nekogram.translator.c
    public final r c(String str, String str2, String str3) throws IOException {
        boolean zC = o0.c(str2);
        String[] strArr = j0.f1116a;
        if (zC) {
            str2 = nh.a.u(-12231521643222L, strArr);
        }
        List<String> listAsList = Arrays.asList(str.split(nh.a.u(-12252996479702L, strArr)));
        String strN = j2.h0.n(j2.h0.p(str2), nh.a.u(-12261586414294L, strArr), str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strU = nh.a.u(-12270176348886L, strArr);
        i iVar = new i();
        iVar.f1109a = listAsList;
        iVar.f1110b = strN;
        iVar.f1111c = strValueOf;
        iVar.f1112d = strU;
        ch.l lVarD = a0.c.D(nh.a.u(-12291651185366L, strArr));
        lVarD.w(nh.a.u(-12476334779094L, strArr), nh.a.u(-12545054255830L, strArr) + o0.f1129a);
        lVarD.w(nh.a.u(-12575119026902L, strArr), nh.a.u(-12622363667158L, strArr));
        eb.m mVar = c.f1085a;
        String strD = mVar.d(iVar);
        String strU2 = nh.a.u(-12789867391702L, strArr);
        ef.l lVar = ug.v.f21877c;
        ug.v vVarH = vb.w.h(strU2);
        ug.z zVar = ug.b0.f21724a;
        lVarD.z(ud.e.q(strD, vVarH));
        ug.d0 d0VarF = j0.a(false).a(new b1(lVarD)).f();
        try {
            if (d0VarF.f21759d == 429) {
                throw new h();
            }
            String strN2 = d0VarF.f21762g.n();
            d0VarF.close();
            if (o0.c(strN2)) {
                return null;
            }
            j jVar = (j) mVar.b(strN2, j.class);
            if (jVar.f1114a == null) {
                if (jVar.f1115b == null) {
                    return null;
                }
                throw new IOException(jVar.f1115b);
            }
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = jVar.f1114a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(nh.a.u(-12927306345174L, strArr));
            }
            return new r(0, sb.toString().trim());
        } catch (Throwable th2) {
            try {
                d0VarF.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
