package app.nekogram.translator;

import b7.b1;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f1143l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f1146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f1147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f1148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile String f1149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f1150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile String f1151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile String f1152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile String f1153k;

    static {
        String[] strArr = j0.f1116a;
        nh.a.u(-20851521006294L, strArr);
        nh.a.u(-21001844861654L, strArr);
    }

    public w() {
        String[] strArr = j0.f1116a;
        this.f1144b = Arrays.asList(nh.a.u(-16131351947990L, strArr), nh.a.u(-16144236849878L, strArr), nh.a.u(-16170006653654L, strArr), nh.a.u(-16182891555542L, strArr), nh.a.u(-16195776457430L, strArr), nh.a.u(-16208661359318L, strArr), nh.a.u(-16221546261206L, strArr), nh.a.u(-16234431163094L, strArr), nh.a.u(-16247316064982L, strArr), nh.a.u(-16260200966870L, strArr), nh.a.u(-16273085868758L, strArr), nh.a.u(-16285970770646L, strArr), nh.a.u(-16298855672534L, strArr), nh.a.u(-16311740574422L, strArr), nh.a.u(-16324625476310L, strArr), nh.a.u(-16337510378198L, strArr), nh.a.u(-16350395280086L, strArr), nh.a.u(-16363280181974L, strArr));
        this.f1145c = 0L;
        this.f1148f = nh.a.u(-16376165083862L, strArr);
        this.f1149g = nh.a.u(-16449179527894L, strArr);
        this.f1150h = new Random().nextInt(700) - 100;
        this.f1151i = nh.a.u(-16522193971926L, strArr);
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
        sbP.append(nh.a.u(-16526488939222L, strArr));
        sbP.append(upperCase);
        return this.f1144b.contains(sbP.toString()) ? j2.h0.n(j2.h0.p(lowerCase), nh.a.u(-16535078873814L, strArr), upperCase) : (lowerCase.equals(nh.a.u(-16543668808406L, strArr)) && upperCase.equals(nh.a.u(-16556553710294L, strArr))) ? nh.a.u(-16569438612182L, strArr) : lowerCase;
    }

    @Override // app.nekogram.translator.c
    public final synchronized r c(String str, String str2, String str3) {
        String[] strArr;
        JSONObject jSONObject;
        StringBuilder sb;
        JSONObject jSONObject2;
        try {
            String strU = o0.c(str2) ? nh.a.u(-16595208415958L, j0.f1116a) : str2;
            if (this.f1152j != null && !Objects.equals(this.f1152j, strU)) {
                this.f1151i += nh.a.u(-16616683252438L, j0.f1116a);
            }
            this.f1152j = strU;
            if (this.f1153k != null && !Objects.equals(this.f1153k, str3)) {
                this.f1151i += nh.a.u(-16625273187030L, j0.f1116a);
            }
            this.f1153k = str3;
            this.f1151i += nh.a.u(-16633863121622L, j0.f1116a);
            for (int i10 = 0; i10 < str.length(); i10 += 108) {
                this.f1151i += nh.a.u(-16642453056214L, j0.f1116a);
            }
            String str4 = str;
            String strU2 = strU;
            while (true) {
                byte[] bArrDoFinal = null;
                if (System.currentTimeMillis() - this.f1145c > 30000) {
                    if (this.f1146d == null || this.f1147e == null) {
                        jSONObject2 = new JSONObject(d(nh.a.u(-18411979582166L, j0.f1116a), null, null));
                    } else {
                        String[] strArr2 = j0.f1116a;
                        jSONObject2 = new JSONObject(d(nh.a.u(-18562303437526L, strArr2), nh.a.u(-18712627292886L, strArr2) + this.f1146d + nh.a.u(-18734102129366L, strArr2) + this.f1147e, null));
                    }
                    String[] strArr3 = j0.f1116a;
                    this.f1146d = jSONObject2.getString(nh.a.u(-18759871933142L, strArr3));
                    this.f1147e = jSONObject2.getString(nh.a.u(-18777051802326L, strArr3));
                    this.f1145c = System.currentTimeMillis();
                }
                StringBuilder sb2 = new StringBuilder();
                String[] strArr4 = j0.f1116a;
                sb2.append(nh.a.u(-16651042990806L, strArr4));
                sb2.append(strU2);
                sb2.append(nh.a.u(-16685402729174L, strArr4));
                sb2.append(str3);
                sb2.append(nh.a.u(-16724057434838L, strArr4));
                sb2.append(URLEncoder.encode(str4, nh.a.u(-4333076785878L, strArr4)));
                sb2.append(nh.a.u(-16779892009686L, strArr4));
                sb2.append(URLEncoder.encode(this.f1146d, nh.a.u(-4333076785878L, strArr4)));
                sb2.append(nh.a.u(-16805661813462L, strArr4));
                sb2.append(URLEncoder.encode(this.f1147e, nh.a.u(-4333076785878L, strArr4)));
                sb2.append(nh.a.u(-16831431617238L, strArr4));
                sb2.append(System.currentTimeMillis());
                String string = sb2.toString();
                String strU3 = nh.a.u(-17024705145558L, strArr4);
                String str5 = this.f1151i + nh.a.u(-18287425530582L, strArr4) + System.currentTimeMillis() + nh.a.u(-18296015465174L, strArr4) + this.f1150h;
                try {
                    Cipher cipher = Cipher.getInstance(nh.a.u(-18304605399766L, strArr4));
                    cipher.init(1, new SecretKeySpec(this.f1148f.getBytes(Charset.defaultCharset()), nh.a.u(-18394799712982L, strArr4)), new IvParameterSpec(this.f1149g.getBytes(Charset.defaultCharset())));
                    bArrDoFinal = cipher.doFinal(str5.getBytes(Charset.defaultCharset()));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                int length = bArrDoFinal.length;
                byte[] bArr = h0.f1108e;
                int i11 = (length / 3) * 4;
                if (length % 3 > 0) {
                    i11 += 4;
                }
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    int i15 = i12 + 3;
                    if (i15 > length) {
                        break;
                    }
                    int i16 = ((bArrDoFinal[i12 + 1] & 255) << 8) | ((bArrDoFinal[i12] & 255) << 16) | (bArrDoFinal[i12 + 2] & 255);
                    bArr2[i13] = bArr[(i16 >> 18) & 63];
                    bArr2[i13 + 1] = bArr[(i16 >> 12) & 63];
                    bArr2[i13 + 2] = bArr[(i16 >> 6) & 63];
                    bArr2[i13 + 3] = bArr[i16 & 63];
                    int i17 = i13 + 4;
                    i14--;
                    if (i14 == 0) {
                        i13 += 5;
                        bArr2[i17] = 10;
                        i14 = 19;
                    } else {
                        i13 = i17;
                    }
                    i12 = i15;
                }
                if (i12 == length - 1) {
                    int i18 = (bArrDoFinal[i12] & 255) << 4;
                    bArr2[i13] = bArr[(i18 >> 6) & 63];
                    bArr2[i13 + 1] = bArr[i18 & 63];
                    bArr2[i13 + 2] = 61;
                    bArr2[i13 + 3] = 61;
                } else if (i12 == length - 2) {
                    int i19 = ((bArrDoFinal[i12 + 1] & 255) << 2) | ((bArrDoFinal[i12] & 255) << 10);
                    bArr2[i13] = bArr[(i19 >> 12) & 63];
                    bArr2[i13 + 1] = bArr[(i19 >> 6) & 63];
                    bArr2[i13 + 2] = bArr[i19 & 63];
                    bArr2[i13 + 3] = 61;
                }
                String strD = d(strU3, string, new String(bArr2, StandardCharsets.US_ASCII));
                strArr = j0.f1116a;
                if (strD.startsWith(nh.a.u(-17175029000918L, strArr))) {
                    Thread.sleep(3000L);
                } else {
                    jSONObject = new JSONObject(strD);
                    if (jSONObject.getInt(nh.a.u(-17200798804694L, strArr)) == -111) {
                        Thread.sleep(3000L);
                    } else if (jSONObject.getJSONObject(nh.a.u(-17235158543062L, strArr)).getString(nh.a.u(-17278108216022L, strArr)).contentEquals(str3)) {
                        if (jSONObject.getJSONObject(nh.a.u(-17729079782102L, strArr)).getJSONArray(nh.a.u(-17772029455062L, strArr)).length() == 0) {
                            this.f1151i = nh.a.u(-17806389193430L, strArr);
                        } else {
                            if (!(jSONObject.get(nh.a.u(-17814979128022L, strArr)) instanceof JSONObject) || !jSONObject.getJSONObject(nh.a.u(-17836453964502L, strArr)).has(nh.a.u(-17857928800982L, strArr))) {
                                break;
                            }
                            str4 = nh.a.u(-17879403637462L, strArr) + str4;
                        }
                    } else if (jSONObject.getJSONObject(nh.a.u(-17308172987094L, strArr)).getString(nh.a.u(-17351122660054L, strArr)).contentEquals(nh.a.u(-17381187431126L, strArr))) {
                        strU2 = nh.a.u(-17394072333014L, strArr);
                    } else {
                        if (!jSONObject.getJSONObject(nh.a.u(-17406957234902L, strArr)).getString(nh.a.u(-17449906907862L, strArr)).contentEquals(nh.a.u(-17479971678934L, strArr))) {
                            throw new RuntimeException(nh.a.u(-17505741482710L, strArr) + jSONObject.getJSONObject(nh.a.u(-17634590501590L, strArr)).getString(nh.a.u(-17677540174550L, strArr)) + nh.a.u(-17707604945622L, strArr) + str3);
                        }
                        strU2 = nh.a.u(-17492856580822L, strArr);
                    }
                }
            }
            if (jSONObject.getJSONObject(nh.a.u(-17887993572054L, strArr)).getString(nh.a.u(-17930943245014L, strArr)).contentEquals(nh.a.u(-17961008016086L, strArr))) {
                nh.a.u(-17973892917974L, strArr);
            } else if (jSONObject.getJSONObject(nh.a.u(-17986777819862L, strArr)).getString(nh.a.u(-18029727492822L, strArr)).contentEquals(nh.a.u(-18059792263894L, strArr))) {
                nh.a.u(-18072677165782L, strArr);
            } else {
                jSONObject.getJSONObject(nh.a.u(-18085562067670L, strArr)).getString(nh.a.u(-18128511740630L, strArr));
            }
            sb = new StringBuilder();
            JSONArray jSONArray = jSONObject.getJSONObject(nh.a.u(-18158576511702L, strArr)).getJSONArray(nh.a.u(-18201526184662L, strArr));
            for (int i20 = 0; i20 < jSONArray.length(); i20++) {
                sb.append(((JSONObject) jSONArray.get(i20)).getString(nh.a.u(-18235885923030L, j0.f1116a)));
            }
            this.f1151i = nh.a.u(-18283130563286L, j0.f1116a);
        } catch (Throwable th2) {
            throw th2;
        }
        return new r(0, sb.toString());
    }

    public final String d(String str, String str2, String str3) {
        String[] strArr = j0.f1116a;
        ug.x xVarA = j0.a(false);
        ch.l lVarD = a0.c.D(str);
        if (this.f1146d != null && this.f1147e != null) {
            lVarD.w(nh.a.u(-18794231671510L, strArr), nh.a.u(-18824296442582L, strArr) + this.f1146d + nh.a.u(-18910195788502L, strArr) + this.f1147e);
        }
        lVarD.w(nh.a.u(-18940260559574L, strArr), nh.a.u(-18970325330646L, strArr));
        lVarD.w(nh.a.u(-19172188793558L, strArr), nh.a.u(-19245203237590L, strArr));
        if (str3 != null) {
            lVarD.w(nh.a.u(-19309627747030L, strArr), str3);
        }
        lVarD.w(nh.a.u(-19322512648918L, strArr), nh.a.u(-19369757289174L, strArr));
        lVarD.w(nh.a.u(-19850793626326L, strArr), nh.a.u(-19880858397398L, strArr));
        lVarD.w(nh.a.u(-19971052710614L, strArr), nh.a.u(-20035477220054L, strArr));
        lVarD.w(nh.a.u(-20087016827606L, strArr), nh.a.u(-20151441337046L, strArr));
        lVarD.w(nh.a.u(-20172916173526L, strArr), nh.a.u(-20237340682966L, strArr));
        lVarD.w(nh.a.u(-20263110486742L, strArr), nh.a.u(-20297470225110L, strArr));
        lVarD.w(nh.a.u(-20391959505622L, strArr), nh.a.u(-20460678982358L, strArr));
        if (str2 == null) {
            str2 = nh.a.u(-20615297805014L, strArr);
        }
        String strU = nh.a.u(-20619592772310L, strArr);
        ef.l lVar = ug.v.f21877c;
        ug.v vVarW = vb.w.w(strU);
        ug.z zVar = ug.b0.f21724a;
        lVarD.z(ud.e.q(str2, vVarW));
        ug.d0 d0VarF = xVarA.a(new b1(lVarD)).f();
        try {
            ug.r rVar = d0VarF.f21761f;
            String strA = rVar.a(nh.a.u(-20830046169814L, strArr));
            String strA2 = rVar.a(nh.a.u(-20838636104406L, strArr));
            if (strA != null) {
                e(Long.parseLong(strA2), strA);
            }
            if (d0VarF.f21759d == 429) {
                throw new h();
            }
            ug.f0 f0Var = d0VarF.f21762g;
            if (f0Var == null) {
                d0VarF.close();
                return null;
            }
            String strN = f0Var.n();
            d0VarF.close();
            return strN;
        } catch (Throwable th2) {
            try {
                d0VarF.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
    
        if (r10 != 4) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r18, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.nekogram.translator.w.e(long, java.lang.String):void");
    }
}
