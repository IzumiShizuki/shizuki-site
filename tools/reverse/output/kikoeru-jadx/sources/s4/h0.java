package s4;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f19415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f19416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f19417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f19418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f19419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f19420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19422m;

    public h0() {
        super(true);
        this.f19414e = 8000;
        byte[] bArr = new byte[2000];
        this.f19415f = bArr;
        this.f19416g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // s4.h
    public final void close() {
        this.f19417h = null;
        MulticastSocket multicastSocket = this.f19419j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f19420k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f19419j = null;
        }
        DatagramSocket datagramSocket = this.f19418i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19418i = null;
        }
        this.f19420k = null;
        this.f19422m = 0;
        if (this.f19421l) {
            this.f19421l = false;
            b();
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws g0 {
        Uri uri = mVar.f19443a;
        this.f19417h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f19417h.getPort();
        c();
        try {
            this.f19420k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19420k, port);
            if (this.f19420k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19419j = multicastSocket;
                multicastSocket.joinGroup(this.f19420k);
                this.f19418i = this.f19419j;
            } else {
                this.f19418i = new DatagramSocket(inetSocketAddress);
            }
            this.f19418i.setSoTimeout(this.f19414e);
            this.f19421l = true;
            e(mVar);
            return -1L;
        } catch (IOException e10) {
            throw new g0(e10, 2001);
        } catch (SecurityException e11) {
            throw new g0(e11, 2006);
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws g0 {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f19422m;
        DatagramPacket datagramPacket = this.f19416g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f19418i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f19422m = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new g0(e10, 2002);
            } catch (IOException e11) {
                throw new g0(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f19422m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f19415f, length2 - i13, bArr, i10, iMin);
        this.f19422m -= iMin;
        return iMin;
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19417h;
    }
}
