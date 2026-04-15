package app.nekogram.translator;

import b7.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1077h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1083g;

    public b() {
        String[] strArr = j0.f1116a;
        this.f1078b = Arrays.asList(nh.a.u(-3749751510L, strArr), nh.a.u(-16634653398L, strArr), nh.a.u(-29519555286L, strArr), nh.a.u(-42404457174L, strArr), nh.a.u(-55289359062L, strArr), nh.a.u(-68174260950L, strArr), nh.a.u(-81059162838L, strArr), nh.a.u(-93944064726L, strArr), nh.a.u(-106828966614L, strArr), nh.a.u(-119713868502L, strArr), nh.a.u(-132598770390L, strArr), nh.a.u(-145483672278L, strArr), nh.a.u(-158368574166L, strArr), nh.a.u(-171253476054L, strArr), nh.a.u(-184138377942L, strArr), nh.a.u(-197023279830L, strArr), nh.a.u(-209908181718L, strArr), nh.a.u(-222793083606L, strArr), nh.a.u(-235677985494L, strArr), nh.a.u(-248562887382L, strArr), nh.a.u(-261447789270L, strArr), nh.a.u(-274332691158L, strArr), nh.a.u(-287217593046L, strArr), nh.a.u(-300102494934L, strArr), nh.a.u(-312987396822L, strArr), nh.a.u(-338757200598L, strArr));
        this.f1079c = Arrays.asList(nh.a.u(-351642102486L, strArr), nh.a.u(-364527004374L, strArr), nh.a.u(-377411906262L, strArr), nh.a.u(-390296808150L, strArr), nh.a.u(-407476677334L, strArr), nh.a.u(-424656546518L, strArr), nh.a.u(-441836415702L, strArr), nh.a.u(-454721317590L, strArr), nh.a.u(-471901186774L, strArr), nh.a.u(-484786088662L, strArr), nh.a.u(-497670990550L, strArr), nh.a.u(-510555892438L, strArr), nh.a.u(-523440794326L, strArr), nh.a.u(-536325696214L, strArr), nh.a.u(-549210598102L, strArr), nh.a.u(-562095499990L, strArr), nh.a.u(-579275369174L, strArr), nh.a.u(-596455238358L, strArr), nh.a.u(-613635107542L, strArr), nh.a.u(-630814976726L, strArr), nh.a.u(-643699878614L, strArr), nh.a.u(-660879747798L, strArr), nh.a.u(-678059616982L, strArr), nh.a.u(-695239486166L, strArr), nh.a.u(-708124388054L, strArr), nh.a.u(-725304257238L, strArr));
        this.f1080d = UUID.randomUUID().toString().toUpperCase().replace(nh.a.u(-742484126422L, strArr), nh.a.u(-751074061014L, strArr)) + nh.a.u(-755369028310L, strArr) + d(9);
        this.f1081e = nh.a.u(-763958962902L, strArr) + d(32) + nh.a.u(-785433799382L, strArr) + d(8);
        nh.a.u(-794023733974L, strArr);
        nh.a.u(-824088505046L, strArr);
        this.f1082f = UUID.randomUUID().toString().toUpperCase().replace(nh.a.u(-836973406934L, strArr), nh.a.u(-845563341526L, strArr));
        this.f1083g = String.valueOf(System.currentTimeMillis());
    }

    public static String d(int i10) {
        char[] charArray = nh.a.u(-4028134107862L, j0.f1116a).toCharArray();
        char[] cArr = new char[i10];
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = charArray[random.nextInt(charArray.length)];
        }
        return new String(cArr);
    }

    public static String e(LinkedHashMap linkedHashMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : linkedHashMap.keySet()) {
            String[] strArr = j0.f1116a;
            if (str != null && nh.a.u(-3899285088982L, strArr).equals(str2)) {
                sb.append(nh.a.u(-3972299533014L, strArr));
                sb.append(nh.a.u(-3993774369494L, strArr));
                sb.append(str);
                sb.append(nh.a.u(-4002364304086L, strArr));
            }
            sb.append(str2);
            sb.append(nh.a.u(-4010954238678L, strArr));
            sb.append((String) linkedHashMap.get(str2));
            sb.append(nh.a.u(-4019544173270L, strArr));
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
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
        sbP.append(nh.a.u(-849858308822L, strArr));
        sbP.append(upperCase);
        return this.f1078b.contains(sbP.toString()) ? j2.h0.n(j2.h0.p(lowerCase), nh.a.u(-858448243414L, strArr), upperCase) : (lowerCase.equals(nh.a.u(-867038178006L, strArr)) && upperCase.equals(nh.a.u(-879923079894L, strArr))) ? nh.a.u(-892807981782L, strArr) : lowerCase;
    }

    @Override // app.nekogram.translator.c
    public final String b(String str) {
        int iIndexOf = this.f1078b.indexOf(str);
        return iIndexOf < 0 ? str : (String) this.f1079c.get(iIndexOf);
    }

    @Override // app.nekogram.translator.c
    public final r c(String str, String str2, String str3) throws IOException {
        boolean zC = o0.c(str2);
        String[] strArr = j0.f1116a;
        if (zC) {
            str2 = nh.a.u(-927167720150L, strArr);
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(nh.a.u(-948642556630L, strArr), nh.a.u(-983002294998L, strArr));
        linkedHashMap.put(nh.a.u(-1021657000662L, strArr), nh.a.u(-1068901640918L, strArr));
        String strU = nh.a.u(-1098966411990L, strArr);
        String str4 = this.f1080d;
        linkedHashMap.put(strU, str4);
        linkedHashMap.put(nh.a.u(-1120441248470L, strArr), nh.a.u(-1137621117654L, strArr));
        linkedHashMap.put(nh.a.u(-1159095954134L, strArr), this.f1081e);
        linkedHashMap.put(nh.a.u(-1189160725206L, strArr), nh.a.u(-1223520463574L, strArr));
        linkedHashMap.put(nh.a.u(-1253585234646L, strArr), nh.a.u(-1275060071126L, strArr));
        linkedHashMap.put(nh.a.u(-1296534907606L, strArr), nh.a.u(-1330894645974L, strArr));
        linkedHashMap.put(nh.a.u(-1348074515158L, strArr), nh.a.u(-1408204057302L, strArr));
        linkedHashMap.put(nh.a.u(-1421088959190L, strArr), nh.a.u(-1451153730262L, strArr));
        linkedHashMap.put(nh.a.u(-1464038632150L, strArr), nh.a.u(-1511283272406L, strArr));
        linkedHashMap.put(nh.a.u(-1519873206998L, strArr), nh.a.u(-1571412814550L, strArr));
        linkedHashMap.put(nh.a.u(-1648722225878L, strArr), nh.a.u(-1683081964246L, strArr));
        linkedHashMap.put(nh.a.u(-1704556800726L, strArr), nh.a.u(-1734621571798L, strArr));
        linkedHashMap.put(nh.a.u(-1760391375574L, strArr), nh.a.u(-1799046081238L, strArr));
        linkedHashMap.put(nh.a.u(-1850585688790L, strArr), nh.a.u(-1884945427158L, strArr));
        linkedHashMap.put(nh.a.u(-1897830329046L, strArr), nh.a.u(-1915010198230L, strArr));
        linkedHashMap.put(nh.a.u(-1936485034710L, strArr), nh.a.u(-1957959871190L, strArr));
        linkedHashMap.put(nh.a.u(-1962254838486L, strArr), nh.a.u(-1983729674966L, strArr));
        linkedHashMap.put(nh.a.u(-2018089413334L, strArr), nh.a.u(-2035269282518L, strArr));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(nh.a.u(-2069629020886L, strArr), nh.a.u(-2138348497622L, strArr));
        linkedHashMap2.put(nh.a.u(-2146938432214L, strArr), this.f1083g);
        linkedHashMap2.put(nh.a.u(-2219952876246L, strArr), this.f1082f);
        linkedHashMap2.put(nh.a.u(-2258607581910L, strArr), nh.a.u(-2284377385686L, strArr));
        linkedHashMap2.put(nh.a.u(-2292967320278L, strArr), nh.a.u(-2335916993238L, strArr));
        linkedHashMap2.put(nh.a.u(-2344506927830L, strArr), nh.a.u(-2413226404566L, strArr));
        linkedHashMap2.put(nh.a.u(-2512010652374L, strArr), nh.a.u(-2542075423446L, strArr));
        linkedHashMap2.put(nh.a.u(-2550665358038L, strArr), nh.a.u(-2632269736662L, strArr));
        linkedHashMap2.put(nh.a.u(-2640859671254L, strArr), str2);
        linkedHashMap2.put(nh.a.u(-2662334507734L, strArr), strValueOf);
        linkedHashMap2.put(nh.a.u(-2705284180694L, strArr), nh.a.u(-2756823788246L, strArr));
        linkedHashMap2.put(nh.a.u(-2765413722838L, strArr), str);
        linkedHashMap2.put(nh.a.u(-2791183526614L, strArr), nh.a.u(-2829838232278L, strArr));
        linkedHashMap2.put(nh.a.u(-2838428166870L, strArr), nh.a.u(-2889967774422L, strArr));
        linkedHashMap2.put(nh.a.u(-2898557709014L, strArr), nh.a.u(-2932917447382L, strArr));
        linkedHashMap2.put(nh.a.u(-2941507381974L, strArr), nh.a.u(-2988752022230L, strArr));
        linkedHashMap2.put(nh.a.u(-2997341956822L, strArr), nh.a.u(-3078946335446L, strArr));
        linkedHashMap2.put(nh.a.u(-3087536270038L, strArr), nh.a.u(-3117601041110L, strArr));
        linkedHashMap2.put(nh.a.u(-3121896008406L, strArr), nh.a.u(-3173435615958L, strArr));
        linkedHashMap2.put(nh.a.u(-3207795354326L, strArr), str3);
        linkedHashMap2.put(nh.a.u(-3220680256214L, strArr), nh.a.u(-3242155092694L, strArr));
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(linkedHashMap.keySet());
        arrayList.addAll(linkedHashMap2.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str5 : arrayList) {
            sb.append(str5);
            if (linkedHashMap.containsKey(str5)) {
                sb.append((String) linkedHashMap.get(str5));
            } else {
                sb.append((String) linkedHashMap2.get(str5));
            }
        }
        sb.append(o0.b(nh.a.u(-3285104765654L, strArr) + str4 + nh.a.u(-3293694700246L, strArr) + nh.a.u(-3323759471318L, strArr) + strValueOf));
        String strE = e(linkedHashMap, null);
        String strE2 = e(linkedHashMap2, o0.b(sb.toString()));
        ch.l lVarD = a0.c.D(j2.h0.n(new StringBuilder(), nh.a.u(-3465493392086L, strArr), strE));
        lVarD.w(nh.a.u(-3671651822294L, strArr), nh.a.u(-3718896462550L, strArr));
        String strU2 = nh.a.u(-4187047897814L, strArr);
        ef.l lVar = ug.v.f21877c;
        ug.v vVarH = vb.w.h(strU2);
        ug.z zVar = ug.b0.f21724a;
        lVarD.z(ud.e.q(strE2, vVarH));
        ug.d0 d0VarF = j0.a(true).a(new b1(lVarD)).f();
        try {
            if (d0VarF.f21759d == 429) {
                throw new h();
            }
            String strN = d0VarF.f21762g.n();
            d0VarF.close();
            if (!o0.c(strN)) {
                a aVar = (a) c.f1085a.b(strN, a.class);
                if (aVar.f1073b != null) {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = aVar.f1073b.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(nh.a.u(-918577785558L, strArr));
                    }
                    return new r(0, sb2.toString().trim());
                }
                if (aVar.f1074c != null) {
                    throw new IOException(aVar.f1074c);
                }
            }
            return null;
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
