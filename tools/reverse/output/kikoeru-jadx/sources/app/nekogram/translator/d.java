package app.nekogram.translator;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f1088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f1089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1090f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f1092c;

    static {
        String[] strArr = j0.f1116a;
        nh.a.u(-7446928075478L, strArr);
        f1089e = Pattern.compile(nh.a.u(-7580072061654L, strArr));
        f1090f = UUID.randomUUID().toString();
    }

    public d() {
        String[] strArr = j0.f1116a;
        this.f1091b = Arrays.asList(nh.a.u(-4358846589654L, strArr), nh.a.u(-4371731491542L, strArr), nh.a.u(-4384616393430L, strArr), nh.a.u(-4397501295318L, strArr), nh.a.u(-4410386197206L, strArr), nh.a.u(-4423271099094L, strArr), nh.a.u(-4449040902870L, strArr), nh.a.u(-4474810706646L, strArr), nh.a.u(-4487695608534L, strArr), nh.a.u(-4500580510422L, strArr), nh.a.u(-4513465412310L, strArr), nh.a.u(-4526350314198L, strArr), nh.a.u(-4539235216086L, strArr), nh.a.u(-4552120117974L, strArr), nh.a.u(-4565005019862L, strArr), nh.a.u(-4577889921750L, strArr), nh.a.u(-4590774823638L, strArr), nh.a.u(-4603659725526L, strArr), nh.a.u(-4616544627414L, strArr), nh.a.u(-4629429529302L, strArr), nh.a.u(-4642314431190L, strArr), nh.a.u(-4668084234966L, strArr), nh.a.u(-4693854038742L, strArr), nh.a.u(-4706738940630L, strArr), nh.a.u(-4719623842518L, strArr), nh.a.u(-4732508744406L, strArr), nh.a.u(-4745393646294L, strArr), nh.a.u(-4758278548182L, strArr), nh.a.u(-4771163450070L, strArr), nh.a.u(-4784048351958L, strArr), nh.a.u(-4796933253846L, strArr));
        this.f1092c = new AtomicLong(ThreadLocalRandom.current().nextLong(Long.parseLong(nh.a.u(-4809818155734L, strArr))));
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
        sbP.append(nh.a.u(-4861357763286L, strArr));
        sbP.append(upperCase);
        return this.f1091b.contains(sbP.toString()) ? j2.h0.n(j2.h0.p(lowerCase), nh.a.u(-4869947697878L, strArr), upperCase) : lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[LOOP:1: B:25:0x01eb->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x035b  */
    @Override // app.nekogram.translator.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final app.nekogram.translator.r c(java.lang.String r12, java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.nekogram.translator.d.c(java.lang.String, java.lang.String, java.lang.String):app.nekogram.translator.r");
    }
}
