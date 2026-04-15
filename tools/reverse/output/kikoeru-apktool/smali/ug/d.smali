.class public final Lug/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Lug/t;

.field public final b:Lug/r;

.field public final c:Ljava/lang/String;

.field public final d:Lug/y;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Lug/r;

.field public final h:Lug/q;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 2
    .line 3
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "OkHttp-Sent-Millis"

    .line 9
    .line 10
    sput-object v0, Lug/d;->k:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "OkHttp-Received-Millis"

    .line 18
    .line 19
    sput-object v0, Lug/d;->l:Ljava/lang/String;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Llh/h0;)V
    .locals 11

    const-string v0, "Cache corruption for "

    const-string v1, "rawSource"

    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Lg8/a;->l(Llh/h0;)Llh/b0;

    move-result-object v1

    const-wide v2, 0x7fffffffffffffffL

    .line 3
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x0

    .line 4
    :try_start_1
    new-instance v6, Lug/s;

    invoke-direct {v6}, Lug/s;-><init>()V

    invoke-virtual {v6, v5, v4}, Lug/s;->d(Lug/t;Ljava/lang/String;)V

    invoke-virtual {v6}, Lug/s;->b()Lug/t;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    nop

    move-object v6, v5

    :goto_0
    const/4 v7, 0x5

    if-eqz v6, :cond_7

    .line 5
    :try_start_2
    iput-object v6, p0, Lug/d;->a:Lug/t;

    .line 6
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v0

    .line 7
    iput-object v0, p0, Lug/d;->c:Ljava/lang/String;

    .line 8
    new-instance v0, Lhd/q0;

    const/4 v4, 0x0

    invoke-direct {v0, v4, v7}, Lhd/q0;-><init>(BI)V

    .line 9
    invoke-static {v1}, Lud/s;->x(Llh/b0;)I

    move-result v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_0

    .line 10
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v9

    .line 11
    invoke-virtual {v0, v9}, Lhd/q0;->h(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    .line 12
    :cond_0
    invoke-virtual {v0}, Lhd/q0;->k()Lug/r;

    move-result-object v0

    iput-object v0, p0, Lug/d;->b:Lug/r;

    .line 13
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v0}, Llc/b;->I(Ljava/lang/String;)Lah/j;

    move-result-object v0

    .line 15
    iget-object v6, v0, Lah/j;->c:Ljava/lang/Object;

    check-cast v6, Lug/y;

    iput-object v6, p0, Lug/d;->d:Lug/y;

    .line 16
    iget v6, v0, Lah/j;->b:I

    iput v6, p0, Lug/d;->e:I

    .line 17
    iget-object v0, v0, Lah/j;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lug/d;->f:Ljava/lang/String;

    .line 18
    new-instance v0, Lhd/q0;

    invoke-direct {v0, v4, v7}, Lhd/q0;-><init>(BI)V

    .line 19
    invoke-static {v1}, Lud/s;->x(Llh/b0;)I

    move-result v6

    :goto_2
    if-ge v4, v6, :cond_1

    .line 20
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v7

    .line 21
    invoke-virtual {v0, v7}, Lhd/q0;->h(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 22
    :cond_1
    sget-object v4, Lug/d;->k:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lhd/q0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 23
    sget-object v7, Lug/d;->l:Ljava/lang/String;

    invoke-virtual {v0, v7}, Lhd/q0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 24
    invoke-virtual {v0, v4}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0, v7}, Lhd/q0;->x(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    if-eqz v6, :cond_2

    .line 26
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    goto :goto_3

    :cond_2
    move-wide v6, v9

    :goto_3
    iput-wide v6, p0, Lug/d;->i:J

    if-eqz v8, :cond_3

    .line 27
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    :cond_3
    iput-wide v9, p0, Lug/d;->j:J

    .line 28
    invoke-virtual {v0}, Lhd/q0;->k()Lug/r;

    move-result-object v0

    iput-object v0, p0, Lug/d;->g:Lug/r;

    .line 29
    iget-object v0, p0, Lug/d;->a:Lug/t;

    invoke-virtual {v0}, Lug/t;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 30
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 32
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v0

    .line 33
    sget-object v4, Lug/l;->b:Lug/b;

    invoke-virtual {v4, v0}, Lug/b;->d(Ljava/lang/String;)Lug/l;

    move-result-object v0

    .line 34
    invoke-static {v1}, Lug/d;->a(Llh/b0;)Ljava/util/List;

    move-result-object v4

    .line 35
    invoke-static {v1}, Lug/d;->a(Llh/b0;)Ljava/util/List;

    move-result-object v5

    .line 36
    invoke-virtual {v1}, Llh/b0;->b()Z

    move-result v6

    if-nez v6, :cond_4

    .line 37
    sget-object v6, Lug/h0;->b:Lug/b;

    .line 38
    invoke-virtual {v1, v2, v3}, Llh/b0;->x(J)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lug/b;->e(Ljava/lang/String;)Lug/h0;

    move-result-object v1

    goto :goto_4

    .line 40
    :cond_4
    sget-object v1, Lug/h0;->g:Lug/h0;

    .line 41
    :goto_4
    invoke-static {v4}, Lwg/g;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 42
    new-instance v3, Lug/q;

    invoke-static {v5}, Lwg/g;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lsf/j;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v2}, Lsf/j;-><init>(ILjava/util/List;)V

    invoke-direct {v3, v1, v0, v4, v5}, Lug/q;-><init>(Lug/h0;Lug/l;Ljava/util/List;Lic/a;)V

    .line 43
    iput-object v3, p0, Lug/d;->h:Lug/q;

    goto :goto_5

    .line 44
    :cond_5
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 45
    :cond_6
    iput-object v5, p0, Lug/d;->h:Lug/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    .line 47
    :cond_7
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 49
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 50
    const-string v2, "cache corruption"

    invoke-virtual {v0, v2, v7, v1}, Lfh/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 51
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    :goto_6
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Lug/d0;)V
    .locals 9

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iget-object v0, p1, Lug/d0;->a:Lb7/b1;

    .line 55
    iget-object v1, v0, Lb7/b1;->b:Ljava/lang/Object;

    check-cast v1, Lug/t;

    .line 56
    iput-object v1, p0, Lug/d;->a:Lug/t;

    .line 57
    iget-object v1, p1, Lug/d0;->i:Lug/d0;

    .line 58
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 59
    iget-object v1, v1, Lug/d0;->a:Lb7/b1;

    .line 60
    iget-object v1, v1, Lb7/b1;->d:Ljava/lang/Object;

    check-cast v1, Lug/r;

    .line 61
    iget-object v2, p1, Lug/d0;->f:Lug/r;

    .line 62
    invoke-static {v2}, Lud/s;->D(Lug/r;)Ljava/util/Set;

    move-result-object v3

    .line 63
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lug/r;->b:Lug/r;

    goto :goto_1

    .line 64
    :cond_0
    new-instance v4, Lhd/q0;

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5}, Lhd/q0;-><init>(BI)V

    .line 65
    invoke-virtual {v1}, Lug/r;->size()I

    move-result v5

    :goto_0
    if-ge v6, v5, :cond_2

    .line 66
    invoke-virtual {v1, v6}, Lug/r;->i(I)Ljava/lang/String;

    move-result-object v7

    .line 67
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 68
    invoke-virtual {v1, v6}, Lug/r;->k(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lhd/q0;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v4}, Lhd/q0;->k()Lug/r;

    move-result-object v1

    .line 70
    :goto_1
    iput-object v1, p0, Lug/d;->b:Lug/r;

    .line 71
    iget-object v0, v0, Lb7/b1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 72
    iput-object v0, p0, Lug/d;->c:Ljava/lang/String;

    .line 73
    iget-object v0, p1, Lug/d0;->b:Lug/y;

    .line 74
    iput-object v0, p0, Lug/d;->d:Lug/y;

    .line 75
    iget v0, p1, Lug/d0;->d:I

    .line 76
    iput v0, p0, Lug/d;->e:I

    .line 77
    iget-object v0, p1, Lug/d0;->c:Ljava/lang/String;

    .line 78
    iput-object v0, p0, Lug/d;->f:Ljava/lang/String;

    .line 79
    iput-object v2, p0, Lug/d;->g:Lug/r;

    .line 80
    iget-object v0, p1, Lug/d0;->e:Lug/q;

    .line 81
    iput-object v0, p0, Lug/d;->h:Lug/q;

    .line 82
    iget-wide v0, p1, Lug/d0;->l:J

    .line 83
    iput-wide v0, p0, Lug/d;->i:J

    .line 84
    iget-wide v0, p1, Lug/d0;->m:J

    .line 85
    iput-wide v0, p0, Lug/d;->j:J

    return-void
.end method

.method public static a(Llh/b0;)Ljava/util/List;
    .locals 8

    .line 1
    invoke-static {p0}, Lud/s;->x(Llh/b0;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    sget-object p0, Lvb/r;->a:Lvb/r;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    const-wide v5, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    new-instance v6, Llh/f;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v7, Llh/i;->d:Llh/i;

    .line 41
    .line 42
    invoke-static {v5}, Lg5/w;->r(Ljava/lang/String;)Llh/i;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v6, v5}, Llh/f;->X(Llh/i;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Llh/e;

    .line 52
    .line 53
    invoke-direct {v5, v6, v3}, Llh/e;-><init>(Llh/h;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 67
    .line 68
    const-string v0, "Corrupt certificate in cache entry"

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :cond_2
    return-object v2

    .line 75
    :catch_0
    move-exception p0

    .line 76
    new-instance v0, Ljava/io/IOException;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static b(Llh/a0;Ljava/util/List;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Llh/a0;->b0(J)Llh/g;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Llh/a0;->writeByte(I)Llh/g;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/security/cert/Certificate;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Llh/i;->d:Llh/i;

    .line 35
    .line 36
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lg5/w;->x([B)Llh/i;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, Llh/i;->a:[B

    .line 44
    .line 45
    sget-object v2, Llh/a;->a:[B

    .line 46
    .line 47
    invoke-static {v1, v2}, Llh/a;->a([B[B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Llh/a0;->writeByte(I)Llh/g;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void

    .line 59
    :catch_0
    move-exception p0

    .line 60
    new-instance p1, Ljava/io/IOException;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public final c(Lb5/d0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lug/d;->a:Lug/t;

    .line 2
    .line 3
    iget-object v1, p0, Lug/d;->h:Lug/q;

    .line 4
    .line 5
    iget-object v2, p0, Lug/d;->g:Lug/r;

    .line 6
    .line 7
    iget-object v3, p0, Lug/d;->b:Lug/r;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {p1, v4}, Lb5/d0;->o(I)Llh/f0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    iget-object v5, v0, Lug/t;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, v5}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 21
    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 26
    .line 27
    .line 28
    iget-object v6, p0, Lug/d;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v6}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lug/r;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-long v6, v6

    .line 41
    invoke-virtual {p1, v6, v7}, Llh/a0;->b0(J)Llh/g;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Lug/r;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    const/4 v7, 0x0

    .line 52
    :goto_0
    const-string v8, ": "

    .line 53
    .line 54
    if-ge v7, v6, :cond_0

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v3, v7}, Lug/r;->i(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {p1, v9}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v8}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v7}, Lug/r;->k(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-interface {p1, v8}, Llh/g;->E(Ljava/lang/String;)Llh/g;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v5}, Llh/g;->writeByte(I)Llh/g;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_0
    iget-object v3, p0, Lug/d;->d:Lug/y;

    .line 83
    .line 84
    iget v6, p0, Lug/d;->e:I

    .line 85
    .line 86
    iget-object v7, p0, Lug/d;->f:Ljava/lang/String;

    .line 87
    .line 88
    const-string v9, "protocol"

    .line 89
    .line 90
    invoke-static {v3, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v9, "message"

    .line 94
    .line 95
    invoke-static {v7, v9}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v9, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    sget-object v10, Lug/y;->c:Lug/y;

    .line 104
    .line 105
    if-ne v3, v10, :cond_1

    .line 106
    .line 107
    const-string v3, "HTTP/1.0"

    .line 108
    .line 109
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    const-string v3, "HTTP/1.1"

    .line 114
    .line 115
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :goto_1
    const/16 v3, 0x20

    .line 119
    .line 120
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {p1, v3}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lug/r;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    add-int/lit8 v3, v3, 0x2

    .line 147
    .line 148
    int-to-long v6, v3

    .line 149
    invoke-virtual {p1, v6, v7}, Llh/a0;->b0(J)Llh/g;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lug/r;->size()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    :goto_2
    if-ge v4, v3, :cond_2

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Lug/r;->i(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {p1, v6}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v8}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4}, Lug/r;->k(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-interface {p1, v6}, Llh/g;->E(Ljava/lang/String;)Llh/g;

    .line 176
    .line 177
    .line 178
    invoke-interface {p1, v5}, Llh/g;->writeByte(I)Llh/g;

    .line 179
    .line 180
    .line 181
    add-int/lit8 v4, v4, 0x1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    sget-object v2, Lug/d;->k:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {p1, v2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v8}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 190
    .line 191
    .line 192
    iget-wide v2, p0, Lug/d;->i:J

    .line 193
    .line 194
    invoke-interface {p1, v2, v3}, Llh/g;->b0(J)Llh/g;

    .line 195
    .line 196
    .line 197
    invoke-interface {p1, v5}, Llh/g;->writeByte(I)Llh/g;

    .line 198
    .line 199
    .line 200
    sget-object v2, Lug/d;->l:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {p1, v2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v8}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 206
    .line 207
    .line 208
    iget-wide v2, p0, Lug/d;->j:J

    .line 209
    .line 210
    invoke-interface {p1, v2, v3}, Llh/g;->b0(J)Llh/g;

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, v5}, Llh/g;->writeByte(I)Llh/g;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Lug/t;->f()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_3

    .line 221
    .line 222
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 223
    .line 224
    .line 225
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v1, Lug/q;->b:Lug/l;

    .line 229
    .line 230
    iget-object v0, v0, Lug/l;->a:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Lug/q;->a()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {p1, v0}, Lug/d;->b(Llh/a0;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v1, Lug/q;->c:Ljava/util/List;

    .line 246
    .line 247
    invoke-static {p1, v0}, Lug/d;->b(Llh/a0;Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v1, Lug/q;->a:Lug/h0;

    .line 251
    .line 252
    iget-object v0, v0, Lug/h0;->a:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    .line 259
    .line 260
    :cond_3
    invoke-virtual {p1}, Llh/a0;->close()V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :goto_3
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 265
    :catchall_1
    move-exception v1

    .line 266
    invoke-static {p1, v0}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    throw v1
.end method
