package b5;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1514d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f1515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f1516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1517c;

    public c0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = m4.g.f14209b;
        p4.c.b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f1515a = uuid;
        MediaDrm mediaDrm = new MediaDrm((p4.c0.f16548a >= 27 || !m4.g.f14210c.equals(uuid)) ? uuid : uuid2);
        this.f1516b = mediaDrm;
        this.f1517c = 1;
        if (m4.g.f14211d.equals(uuid) && "ASUS_Z00AD".equals(p4.c0.f16551d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // b5.x
    public final synchronized void a() {
        int i10 = this.f1517c - 1;
        this.f1517c = i10;
        if (i10 == 0) {
            this.f1516b.release();
        }
    }

    @Override // b5.x
    public final Map f(byte[] bArr) {
        return this.f1516b.queryKeyStatus(bArr);
    }

    @Override // b5.x
    public final w h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f1516b.getProvisionRequest();
        return new w(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // b5.x
    public final void i(byte[] bArr, w4.k kVar) {
        if (p4.c0.f16548a >= 31) {
            try {
                MediaDrm mediaDrm = this.f1516b;
                w4.j jVar = kVar.f23402b;
                jVar.getClass();
                LogSessionId logSessionId = jVar.f23400a;
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                b0.f(playbackComponent).setLogSessionId(logSessionId);
            } catch (UnsupportedOperationException unused2) {
                p4.c.B("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // b5.x
    public final u4.a j(byte[] bArr) {
        int i10 = p4.c0.f16548a;
        UUID uuid = this.f1515a;
        if (i10 < 27 && m4.g.f14210c.equals(uuid)) {
            uuid = m4.g.f14209b;
        }
        return new y(uuid, bArr);
    }

    @Override // b5.x
    public final void l(final f fVar) {
        this.f1516b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: b5.a0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                c0 c0Var = this.f1505a;
                f fVar2 = fVar;
                c0Var.getClass();
                d dVar = fVar2.f1548a.f1578w;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // b5.x
    public final byte[] m() {
        return this.f1516b.openSession();
    }

    @Override // b5.x
    public final boolean n(byte[] bArr, String str) throws Throwable {
        boolean zEquals;
        int i10 = p4.c0.f16548a;
        UUID uuid = this.f1515a;
        if (i10 >= 31) {
            boolean zEquals2 = uuid.equals(m4.g.f14211d);
            MediaDrm mediaDrm = this.f1516b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(m4.g.f14210c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            MediaCrypto mediaCrypto2 = new MediaCrypto(uuid, bArr);
            try {
                boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                mediaCrypto2.release();
                return zRequiresSecureDecoderComponent;
            } catch (MediaCryptoException unused) {
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                throw th;
            }
        } catch (MediaCryptoException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // b5.x
    public final void o(byte[] bArr, byte[] bArr2) {
        this.f1516b.restoreKeys(bArr, bArr2);
    }

    @Override // b5.x
    public final void p(byte[] bArr) {
        this.f1516b.closeSession(bArr);
    }

    @Override // b5.x
    public final byte[] s(byte[] bArr, byte[] bArr2) {
        if (m4.g.f14210c.equals(this.f1515a) && p4.c0.f16548a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(p4.c0.p(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e10) {
                p4.c.o("ClearKeyUtil", "Failed to adjust response data: ".concat(p4.c0.p(bArr2)), e10);
            }
        }
        return this.f1516b.provideKeyResponse(bArr, bArr2);
    }

    @Override // b5.x
    public final void t(byte[] bArr) throws DeniedByServerException {
        this.f1516b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    @Override // b5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.v u(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c0.u(byte[], java.util.List, int, java.util.HashMap):b5.v");
    }

    @Override // b5.x
    public final int v() {
        return 2;
    }
}
