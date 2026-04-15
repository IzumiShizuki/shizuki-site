package app.nekogram.translator;

import android.util.Base64;
import b7.b1;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1131c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1132b;

    public q() {
        String[] strArr = j0.f1116a;
        this.f1132b = Arrays.asList(nh.a.u(-12935896279766L, strArr), nh.a.u(-12948781181654L, strArr), nh.a.u(-12961666083542L, strArr), nh.a.u(-12974550985430L, strArr), nh.a.u(-12987435887318L, strArr), nh.a.u(-13000320789206L, strArr), nh.a.u(-13013205691094L, strArr), nh.a.u(-13030385560278L, strArr), nh.a.u(-13043270462166L, strArr), nh.a.u(-13056155364054L, strArr), nh.a.u(-13069040265942L, strArr), nh.a.u(-13081925167830L, strArr), nh.a.u(-13094810069718L, strArr), nh.a.u(-13107694971606L, strArr), nh.a.u(-13120579873494L, strArr), nh.a.u(-13133464775382L, strArr), nh.a.u(-13146349677270L, strArr), nh.a.u(-13159234579158L, strArr), nh.a.u(-13185004382934L, strArr), nh.a.u(-13202184252118L, strArr), nh.a.u(-13215069154006L, strArr), nh.a.u(-13227954055894L, strArr), nh.a.u(-13240838957782L, strArr), nh.a.u(-13253723859670L, strArr), nh.a.u(-13266608761558L, strArr), nh.a.u(-13279493663446L, strArr), nh.a.u(-13292378565334L, strArr), nh.a.u(-13318148369110L, strArr), nh.a.u(-13331033270998L, strArr), nh.a.u(-13343918172886L, strArr), nh.a.u(-13361098042070L, strArr), nh.a.u(-13373982943958L, strArr), nh.a.u(-13386867845846L, strArr), nh.a.u(-13399752747734L, strArr), nh.a.u(-13412637649622L, strArr), nh.a.u(-13425522551510L, strArr), nh.a.u(-13438407453398L, strArr), nh.a.u(-13451292355286L, strArr), nh.a.u(-13464177257174L, strArr), nh.a.u(-13477062159062L, strArr), nh.a.u(-13489947060950L, strArr), nh.a.u(-13502831962838L, strArr), nh.a.u(-13515716864726L, strArr), nh.a.u(-13528601766614L, strArr), nh.a.u(-13541486668502L, strArr), nh.a.u(-13554371570390L, strArr), nh.a.u(-13567256472278L, strArr), nh.a.u(-13593026276054L, strArr), nh.a.u(-13605911177942L, strArr), nh.a.u(-13618796079830L, strArr), nh.a.u(-13631680981718L, strArr), nh.a.u(-13666040720086L, strArr), nh.a.u(-13700400458454L, strArr), nh.a.u(-13713285360342L, strArr), nh.a.u(-13726170262230L, strArr), nh.a.u(-13739055164118L, strArr), nh.a.u(-13751940066006L, strArr), nh.a.u(-13764824967894L, strArr), nh.a.u(-13777709869782L, strArr), nh.a.u(-13790594771670L, strArr), nh.a.u(-13803479673558L, strArr), nh.a.u(-13816364575446L, strArr), nh.a.u(-13829249477334L, strArr), nh.a.u(-13842134379222L, strArr), nh.a.u(-13855019281110L, strArr), nh.a.u(-13867904182998L, strArr), nh.a.u(-13880789084886L, strArr), nh.a.u(-13893673986774L, strArr), nh.a.u(-13906558888662L, strArr), nh.a.u(-13919443790550L, strArr), nh.a.u(-13932328692438L, strArr), nh.a.u(-13945213594326L, strArr), nh.a.u(-13958098496214L, strArr), nh.a.u(-13970983398102L, strArr), nh.a.u(-13988163267286L, strArr), nh.a.u(-14005343136470L, strArr), nh.a.u(-14018228038358L, strArr), nh.a.u(-14031112940246L, strArr), nh.a.u(-14043997842134L, strArr), nh.a.u(-14061177711318L, strArr), nh.a.u(-14086947515094L, strArr), nh.a.u(-14099832416982L, strArr), nh.a.u(-14112717318870L, strArr), nh.a.u(-14151372024534L, strArr), nh.a.u(-14164256926422L, strArr), nh.a.u(-14181436795606L, strArr), nh.a.u(-14194321697494L, strArr), nh.a.u(-14207206599382L, strArr), nh.a.u(-14220091501270L, strArr));
    }

    @Override // app.nekogram.translator.c
    public final String a(String str) {
        String lowerCase = str.toLowerCase();
        if (o0.c("")) {
            return lowerCase;
        }
        String upperCase = "".toUpperCase();
        StringBuilder sbP = j2.h0.p(lowerCase);
        String[] strArr = j0.f1116a;
        sbP.append(nh.a.u(-14232976403158L, strArr));
        sbP.append(upperCase);
        return this.f1132b.contains(sbP.toString()) ? j2.h0.n(j2.h0.p(lowerCase), nh.a.u(-14241566337750L, strArr), upperCase) : lowerCase.equals(nh.a.u(-14250156272342L, strArr)) ? upperCase.equals(nh.a.u(-14263041174230L, strArr)) ? nh.a.u(-14275926076118L, strArr) : upperCase.equals(nh.a.u(-14301695879894L, strArr)) ? nh.a.u(-14314580781782L, strArr) : lowerCase : lowerCase;
    }

    @Override // app.nekogram.translator.c
    public final String b(String str) {
        String[] strArr = j0.f1116a;
        return str.equals(nh.a.u(-14460609669846L, strArr)) ? nh.a.u(-14486379473622L, strArr) : str.equals(nh.a.u(-14520739211990L, strArr)) ? nh.a.u(-14546509015766L, strArr) : str;
    }

    @Override // app.nekogram.translator.c
    public final r c(String str, String str2, String str3) throws IOException {
        String strU;
        boolean zC = o0.c(str2);
        String[] strArr = j0.f1116a;
        String strU2 = zC ? nh.a.u(-14580868754134L, strArr) : str2;
        StringBuilder sb = new StringBuilder();
        sb.append(nh.a.u(-14585163721430L, strArr));
        sb.append(strU2);
        String strN = j2.h0.n(sb, nh.a.u(-14885811432150L, strArr), str3);
        ch.l lVarD = a0.c.D(j2.h0.n(new StringBuilder(), nh.a.u(-14907286268630L, strArr), strN));
        String strU3 = nh.a.u(-14945940974294L, strArr);
        String strReplaceAll = UUID.randomUUID().toString().replaceAll(nh.a.u(-22870155635414L, strArr), nh.a.u(-22878745570006L, strArr));
        try {
            String strEncode = URLEncoder.encode(strN, nh.a.u(-22883040537302L, strArr));
            String strA = o0.a();
            byte[] bytes = String.format(nh.a.u(-22908810341078L, strArr), nh.a.u(-22947465046742L, strArr), strEncode, strA, strReplaceAll).toLowerCase().getBytes(Charset.defaultCharset());
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(nh.a.u(-23046249294550L, strArr), 3), nh.a.u(-23419911449302L, strArr));
            Mac mac = Mac.getInstance(nh.a.u(-23467156089558L, strArr));
            mac.init(secretKeySpec);
            strU = String.format(nh.a.u(-23514400729814L, strArr), nh.a.u(-23578825239254L, strArr), Base64.encodeToString(mac.doFinal(bytes), 2), strA, strReplaceAll);
        } catch (Exception e10) {
            e10.printStackTrace();
            strU = nh.a.u(-23677609487062L, strArr);
        }
        lVarD.w(strU3, strU);
        lVarD.w(nh.a.u(-15010365483734L, strArr), nh.a.u(-15057610123990L, strArr));
        m mVar = new m();
        mVar.f1123a = str;
        m[] mVarArr = {mVar};
        eb.m mVar2 = c.f1085a;
        String strD = mVar2.d(mVarArr);
        String strU4 = nh.a.u(-15113444698838L, strArr);
        ef.l lVar = ug.v.f21877c;
        ug.v vVarH = vb.w.h(strU4);
        ug.z zVar = ug.b0.f21724a;
        lVarD.z(ud.e.q(strD, vVarH));
        ug.d0 d0VarF = j0.a(false).a(new b1(lVarD)).f();
        try {
            if (d0VarF.f21759d == 429) {
                throw new h();
            }
            String strN2 = d0VarF.f21762g.n();
            d0VarF.close();
            if (!o0.c(strN2)) {
                try {
                    n nVar = ((n[]) mVar2.b(strN2, n[].class))[0];
                    l lVar2 = nVar.f1125a;
                    return new r(0, nVar.f1126b.get(0).f1130a);
                } catch (eb.t unused) {
                    o oVar = (o) mVar2.b(strN2, o.class);
                    if (oVar != null && oVar.f1128a != null) {
                        throw new IOException(oVar.f1128a);
                    }
                }
            }
            return null;
        } finally {
        }
    }
}
