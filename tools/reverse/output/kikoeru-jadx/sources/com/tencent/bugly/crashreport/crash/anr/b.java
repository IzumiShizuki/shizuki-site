package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.proguard.X;
import java.util.HashMap;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TraceFileHelper.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TraceFileHelper.a f4697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4699c;

    public b(TraceFileHelper.a aVar, String str, boolean z10) {
        this.f4697a = aVar;
        this.f4698b = str;
        this.f4699c = z10;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(String str, long j10, long j11) {
        return true;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(String str, int i10, String str2, String str3, boolean z10) {
        X.a("new thread %s", str);
        TraceFileHelper.a aVar = this.f4697a;
        if (aVar.f4686a > 0 && aVar.f4688c > 0 && aVar.f4687b != null) {
            if (aVar.f4689d == null) {
                aVar.f4689d = new HashMap();
            }
            aVar.f4689d.put(str, new String[]{str2, str3, t0.B(i10, "")});
        }
        return true;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j10, long j11, String str) {
        X.a("new process %s", str);
        if (!str.equals(this.f4698b)) {
            return true;
        }
        TraceFileHelper.a aVar = this.f4697a;
        aVar.f4686a = j10;
        aVar.f4687b = str;
        aVar.f4688c = j11;
        return this.f4699c;
    }

    @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
    public final boolean a(long j10) {
        X.a("process end %d", Long.valueOf(j10));
        TraceFileHelper.a aVar = this.f4697a;
        return aVar.f4686a <= 0 || aVar.f4688c <= 0 || aVar.f4687b == null;
    }
}
