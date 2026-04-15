package ob;

import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserInfoBean f16301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.bugly.crashreport.biz.c f16302c;

    public b(com.tencent.bugly.crashreport.biz.c cVar, UserInfoBean userInfoBean, boolean z10) {
        this.f16302c = cVar;
        this.f16301b = userInfoBean;
        this.f16300a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.bugly.crashreport.biz.c cVar = this.f16302c;
        UserInfoBean userInfoBean = this.f16301b;
        if (userInfoBean != null) {
            if (userInfoBean != null) {
                try {
                    com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
                    if (aVarM != null) {
                        userInfoBean.f4530j = aVarM.u();
                    }
                } catch (Throwable th2) {
                    if (X.b(th2)) {
                        return;
                    }
                    th2.printStackTrace();
                    return;
                }
            }
            X.a("[UserInfo] Record user info.", new Object[0]);
            cVar.a(userInfoBean, false);
        }
        if (this.f16300a) {
            cVar.b();
        }
    }
}
