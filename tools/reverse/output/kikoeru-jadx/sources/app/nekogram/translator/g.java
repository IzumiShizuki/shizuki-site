package app.nekogram.translator;

import b7.b1;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1103d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f1105c;

    public g() {
        String[] strArr = j0.f1116a;
        this.f1104b = Arrays.asList(nh.a.u(-7597251930838L, strArr), nh.a.u(-7610136832726L, strArr), nh.a.u(-7623021734614L, strArr), nh.a.u(-7635906636502L, strArr), nh.a.u(-7648791538390L, strArr), nh.a.u(-7661676440278L, strArr), nh.a.u(-7674561342166L, strArr), nh.a.u(-7687446244054L, strArr), nh.a.u(-7700331145942L, strArr), nh.a.u(-7713216047830L, strArr), nh.a.u(-7726100949718L, strArr), nh.a.u(-7738985851606L, strArr), nh.a.u(-7751870753494L, strArr), nh.a.u(-7764755655382L, strArr), nh.a.u(-7777640557270L, strArr), nh.a.u(-7790525459158L, strArr), nh.a.u(-7803410361046L, strArr), nh.a.u(-7816295262934L, strArr), nh.a.u(-7829180164822L, strArr), nh.a.u(-7842065066710L, strArr), nh.a.u(-7859244935894L, strArr), nh.a.u(-7872129837782L, strArr), nh.a.u(-7885014739670L, strArr), nh.a.u(-7897899641558L, strArr), nh.a.u(-7910784543446L, strArr), nh.a.u(-7923669445334L, strArr), nh.a.u(-7936554347222L, strArr), nh.a.u(-7953734216406L, strArr), nh.a.u(-7966619118294L, strArr), nh.a.u(-7979504020182L, strArr), nh.a.u(-7992388922070L, strArr), nh.a.u(-8005273823958L, strArr), nh.a.u(-8018158725846L, strArr), nh.a.u(-8031043627734L, strArr), nh.a.u(-8043928529622L, strArr), nh.a.u(-8056813431510L, strArr), nh.a.u(-8073993300694L, strArr), nh.a.u(-8086878202582L, strArr), nh.a.u(-8099763104470L, strArr), nh.a.u(-8112648006358L, strArr), nh.a.u(-8125532908246L, strArr), nh.a.u(-8138417810134L, strArr), nh.a.u(-8151302712022L, strArr), nh.a.u(-8164187613910L, strArr), nh.a.u(-8177072515798L, strArr), nh.a.u(-8189957417686L, strArr), nh.a.u(-8202842319574L, strArr), nh.a.u(-8215727221462L, strArr), nh.a.u(-8228612123350L, strArr), nh.a.u(-8241497025238L, strArr), nh.a.u(-8258676894422L, strArr), nh.a.u(-8271561796310L, strArr), nh.a.u(-8284446698198L, strArr), nh.a.u(-8297331600086L, strArr), nh.a.u(-8314511469270L, strArr), nh.a.u(-8327396371158L, strArr), nh.a.u(-8340281273046L, strArr), nh.a.u(-8353166174934L, strArr), nh.a.u(-8366051076822L, strArr), nh.a.u(-8378935978710L, strArr), nh.a.u(-8391820880598L, strArr), nh.a.u(-8404705782486L, strArr), nh.a.u(-8417590684374L, strArr), nh.a.u(-8430475586262L, strArr), nh.a.u(-8443360488150L, strArr), nh.a.u(-8456245390038L, strArr), nh.a.u(-8469130291926L, strArr), nh.a.u(-8482015193814L, strArr), nh.a.u(-8494900095702L, strArr), nh.a.u(-8507784997590L, strArr), nh.a.u(-8524964866774L, strArr), nh.a.u(-8537849768662L, strArr), nh.a.u(-8576504474326L, strArr), nh.a.u(-8589389376214L, strArr), nh.a.u(-8602274278102L, strArr), nh.a.u(-8619454147286L, strArr), nh.a.u(-8632339049174L, strArr), nh.a.u(-8649518918358L, strArr), nh.a.u(-8662403820246L, strArr), nh.a.u(-8675288722134L, strArr), nh.a.u(-8688173624022L, strArr), nh.a.u(-8701058525910L, strArr), nh.a.u(-8713943427798L, strArr), nh.a.u(-8726828329686L, strArr), nh.a.u(-8739713231574L, strArr), nh.a.u(-8752598133462L, strArr), nh.a.u(-8765483035350L, strArr), nh.a.u(-8778367937238L, strArr), nh.a.u(-8791252839126L, strArr), nh.a.u(-8804137741014L, strArr), nh.a.u(-8817022642902L, strArr), nh.a.u(-8834202512086L, strArr), nh.a.u(-8847087413974L, strArr), nh.a.u(-8859972315862L, strArr), nh.a.u(-8872857217750L, strArr), nh.a.u(-8885742119638L, strArr), nh.a.u(-8898627021526L, strArr), nh.a.u(-8911511923414L, strArr), nh.a.u(-8924396825302L, strArr), nh.a.u(-8941576694486L, strArr), nh.a.u(-8954461596374L, strArr), nh.a.u(-8967346498262L, strArr), nh.a.u(-8980231400150L, strArr), nh.a.u(-8993116302038L, strArr), nh.a.u(-9006001203926L, strArr), nh.a.u(-9018886105814L, strArr), nh.a.u(-9031771007702L, strArr), nh.a.u(-9044655909590L, strArr), nh.a.u(-9057540811478L, strArr), nh.a.u(-9070425713366L, strArr), nh.a.u(-9083310615254L, strArr), nh.a.u(-9096195517142L, strArr), nh.a.u(-9109080419030L, strArr), nh.a.u(-9121965320918L, strArr), nh.a.u(-9134850222806L, strArr), nh.a.u(-9152030091990L, strArr), nh.a.u(-9164914993878L, strArr), nh.a.u(-9177799895766L, strArr), nh.a.u(-9190684797654L, strArr), nh.a.u(-9203569699542L, strArr), nh.a.u(-9216454601430L, strArr), nh.a.u(-9233634470614L, strArr), nh.a.u(-9246519372502L, strArr), nh.a.u(-9259404274390L, strArr), nh.a.u(-9272289176278L, strArr), nh.a.u(-9285174078166L, strArr), nh.a.u(-9298058980054L, strArr), nh.a.u(-9310943881942L, strArr), nh.a.u(-9323828783830L, strArr), nh.a.u(-9336713685718L, strArr), nh.a.u(-9349598587606L, strArr), nh.a.u(-9375368391382L, strArr), nh.a.u(-9401138195158L, strArr), nh.a.u(-9414023097046L, strArr));
        this.f1105c = new SecureRandom();
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
        sbP.append(nh.a.u(-11930873932502L, strArr));
        sbP.append(upperCase);
        return this.f1104b.contains(sbP.toString()) ? j2.h0.n(j2.h0.p(lowerCase), nh.a.u(-11939463867094L, strArr), upperCase) : lowerCase.equals(nh.a.u(-11948053801686L, strArr)) ? upperCase.equals(nh.a.u(-11960938703574L, strArr)) ? nh.a.u(-11973823605462L, strArr) : upperCase.equals(nh.a.u(-11999593409238L, strArr)) ? nh.a.u(-12012478311126L, strArr) : lowerCase : lowerCase;
    }

    @Override // app.nekogram.translator.c
    public final r c(String str, String str2, String str3) throws IOException {
        boolean zC = o0.c(str2);
        String[] strArr = j0.f1116a;
        if (zC) {
            str2 = nh.a.u(-9426907998934L, strArr);
        }
        try {
            ch.l lVarD = a0.c.D((nh.a.u(-9448382835414L, strArr) + URLEncoder.encode(str, nh.a.u(-4333076785878L, strArr)) + nh.a.u(-9710375840470L, strArr) + str2 + nh.a.u(-9813455055574L, strArr) + str3 + nh.a.u(-9916534270678L, strArr) + str3 + nh.a.u(-10023908453078L, strArr)) + nh.a.u(-10741167991510L, strArr) + d(str));
            lVarD.w(nh.a.u(-10839952239318L, strArr), nh.a.u(-10887196879574L, strArr));
            lVarD.w(nh.a.u(-11230794263254L, strArr), nh.a.u(-11295218772694L, strArr));
            lVarD.w(nh.a.u(-11467017464534L, strArr), nh.a.u(-11544326875862L, strArr));
            lVarD.w(nh.a.u(-11690355763926L, strArr), nh.a.u(-11754780273366L, strArr));
            ug.d0 d0VarF = j0.a(false).a(new b1(lVarD)).f();
            try {
                if (d0VarF.f21759d == 429) {
                    throw new h();
                }
                String strN = d0VarF.f21762g.n();
                d0VarF.close();
                if (o0.c(strN)) {
                    return null;
                }
                f fVar = (f) c.f1085a.b(strN, f.class);
                String str4 = fVar.f1099b;
                if (str4 != null) {
                    return new r(0, str4);
                }
                if (fVar.f1098a == null) {
                    return null;
                }
                throw new IOException(fVar.f1098a.f1096a);
            } catch (Throwable th2) {
                try {
                    d0VarF.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    public final String d(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        int iNextInt = this.f1105c.nextInt();
        for (byte b10 : str.getBytes(StandardCharsets.UTF_8)) {
            int i10 = iNextInt + (b10 & 255);
            int i11 = i10 + (i10 << 10);
            iNextInt = i11 ^ (i11 >>> 6);
        }
        int i12 = (iNextInt << 3) + iNextInt;
        int i13 = i12 ^ (i12 >>> 11);
        String string = Long.toString(((long) iNextInt) & 4294967295L, 10);
        String[] strArr = j0.f1116a;
        Mac mac = Mac.getInstance(nh.a.u(-12038248114902L, strArr));
        mac.init(new SecretKeySpec(new byte[]{30, 99, 85, 13, -4, -80, -46, -45, 93, -108, 25, 101, 7, -18, 49, 36, -5, -1, -127, -36, -22, -97, -98, 47, 34, -45, -128, -89, 14, 109, 30, 101}, nh.a.u(-12085492755158L, strArr)));
        mac.update(string.toString().getBytes(StandardCharsets.US_ASCII));
        byte[] bArrDoFinal = mac.doFinal();
        int i14 = (int) ((((long) ((i13 + (i13 << 15)) ^ ((((bArrDoFinal[0] & 255) | ((bArrDoFinal[3] & 255) << 24)) | ((bArrDoFinal[1] & 255) << 8)) | ((bArrDoFinal[2] & 255) << 16)))) & 4294967295L) % (((long) 1000000) & 4294967295L));
        return Long.toString(((long) i14) & 4294967295L, 10) + nh.a.u(-12132737395414L, strArr) + Long.toString(((long) (i14 ^ iNextInt)) & 4294967295L, 10);
    }
}
