.class public Lcom/tencent/bugly/proguard/U;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:I

.field public b:I

.field private final c:Landroid/content/Context;

.field private final d:I

.field private final e:[B

.field private final f:Lcom/tencent/bugly/crashreport/common/info/a;

.field private final g:Lcom/tencent/bugly/crashreport/common/strategy/c;

.field private final h:Lcom/tencent/bugly/proguard/O;

.field private final i:Lcom/tencent/bugly/proguard/T;

.field private final j:I

.field private final k:Lcom/tencent/bugly/proguard/P;

.field private final l:Lcom/tencent/bugly/proguard/P;

.field private m:Ljava/lang/String;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected p:I

.field protected q:J

.field protected r:J

.field private s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZIIZLjava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "II[B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/P;",
            "ZIIZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p8, 0x2

    .line 3
    iput p8, p0, Lcom/tencent/bugly/proguard/U;->a:I

    const/16 p8, 0x7530

    .line 4
    iput p8, p0, Lcom/tencent/bugly/proguard/U;->b:I

    const/4 p8, 0x0

    .line 5
    iput-object p8, p0, Lcom/tencent/bugly/proguard/U;->m:Ljava/lang/String;

    const/4 p8, 0x0

    .line 6
    iput p8, p0, Lcom/tencent/bugly/proguard/U;->p:I

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/U;->q:J

    .line 8
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/U;->r:J

    .line 9
    iput-boolean p8, p0, Lcom/tencent/bugly/proguard/U;->s:Z

    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/proguard/U;->c:Landroid/content/Context;

    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object p8

    iput-object p8, p0, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 12
    iput-object p4, p0, Lcom/tencent/bugly/proguard/U;->e:[B

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b()Lcom/tencent/bugly/crashreport/common/strategy/c;

    move-result-object p4

    iput-object p4, p0, Lcom/tencent/bugly/proguard/U;->g:Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 14
    invoke-static {p1}, Lcom/tencent/bugly/proguard/O;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/O;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/U;->h:Lcom/tencent/bugly/proguard/O;

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/T;->a()Lcom/tencent/bugly/proguard/T;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/U;->i:Lcom/tencent/bugly/proguard/T;

    .line 16
    iput p2, p0, Lcom/tencent/bugly/proguard/U;->j:I

    .line 17
    iput-object p5, p0, Lcom/tencent/bugly/proguard/U;->m:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lcom/tencent/bugly/proguard/U;->n:Ljava/lang/String;

    .line 19
    iput-object p7, p0, Lcom/tencent/bugly/proguard/U;->k:Lcom/tencent/bugly/proguard/P;

    .line 20
    iget-object p1, p1, Lcom/tencent/bugly/proguard/T;->d:Lcom/tencent/bugly/proguard/P;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/U;->l:Lcom/tencent/bugly/proguard/P;

    .line 21
    iput p3, p0, Lcom/tencent/bugly/proguard/U;->d:I

    if-lez p9, :cond_0

    .line 22
    iput p9, p0, Lcom/tencent/bugly/proguard/U;->a:I

    :cond_0
    if-lez p10, :cond_1

    .line 23
    iput p10, p0, Lcom/tencent/bugly/proguard/U;->b:I

    .line 24
    :cond_1
    iput-boolean p11, p0, Lcom/tencent/bugly/proguard/U;->s:Z

    .line 25
    iput-object p12, p0, Lcom/tencent/bugly/proguard/U;->o:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZZ)V
    .locals 13

    const/16 v10, 0x7530

    const/4 v12, 0x0

    const/4 v9, 0x2

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v11, p9

    .line 1
    invoke-direct/range {v0 .. v12}, Lcom/tencent/bugly/proguard/U;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZIIZLjava/util/Map;)V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 41
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 42
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    const-string v2, "?aid="

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    .line 45
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    return-object p0
.end method

.method private static a(Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 46
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    const-string v1, "status"

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const-string v4, "[Upload] Headers does not contain %s"

    if-nez v2, :cond_1

    .line 48
    new-array p0, v3, [Ljava/lang/Object;

    aput-object v1, p0, v0

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    .line 49
    :cond_1
    const-string v1, "Bugly-Version"

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 50
    new-array p0, v3, [Ljava/lang/Object;

    aput-object v1, p0, v0

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    .line 51
    :cond_2
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const-string v1, "bugly"

    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 53
    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "[Upload] Bugly version is not valid: %s"

    invoke-static {p0, v1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    .line 54
    :cond_3
    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "[Upload] Bugly version from headers is: %s"

    invoke-static {p0, v1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v3

    .line 55
    :cond_4
    :goto_0
    new-array p0, v0, [Ljava/lang/Object;

    const-string v1, "[Upload] Headers is empty."

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/U;->i:Lcom/tencent/bugly/proguard/T;

    iget v1, p0, Lcom/tencent/bugly/proguard/U;->j:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/T;->a(IJ)V

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/U;->k:Lcom/tencent/bugly/proguard/P;

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lcom/tencent/bugly/proguard/U;->d:I

    invoke-interface {v0, v1}, Lcom/tencent/bugly/proguard/P;->a(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/U;->l:Lcom/tencent/bugly/proguard/P;

    if-eqz v0, :cond_1

    .line 5
    iget v1, p0, Lcom/tencent/bugly/proguard/U;->d:I

    invoke-interface {v0, v1}, Lcom/tencent/bugly/proguard/P;->a(I)V

    :cond_1
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const-string p1, "[Upload] Failed to upload(%d): %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public a(J)V
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/U;->r:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/U;->r:J

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    .locals 21

    move-object/from16 v0, p0

    .line 7
    iget v1, v0, Lcom/tencent/bugly/proguard/U;->d:I

    const/16 v2, 0x276

    if-eq v1, v2, :cond_1

    const/16 v2, 0x280

    if-eq v1, v2, :cond_0

    const/16 v2, 0x33e

    if-eq v1, v2, :cond_1

    const/16 v2, 0x348

    if-eq v1, v2, :cond_0

    .line 8
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "userinfo"

    goto :goto_0

    :cond_1
    const-string v1, "crash"

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_2

    .line 9
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    const-string v1, "[Upload] Success: %s"

    invoke-static {v1, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_2
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    aput-object v1, v5, v3

    const/4 v1, 0x2

    aput-object p4, v5, v1

    const-string v1, "[Upload] Failed to upload(%d) %s: %s"

    invoke-static {v1, v5}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 11
    :goto_1
    iget-wide v1, v0, Lcom/tencent/bugly/proguard/U;->q:J

    iget-wide v3, v0, Lcom/tencent/bugly/proguard/U;->r:J

    add-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_3

    .line 12
    iget-object v1, v0, Lcom/tencent/bugly/proguard/U;->i:Lcom/tencent/bugly/proguard/T;

    iget-boolean v2, v0, Lcom/tencent/bugly/proguard/U;->s:Z

    .line 13
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/T;->a(Z)J

    move-result-wide v1

    iget-wide v3, v0, Lcom/tencent/bugly/proguard/U;->q:J

    add-long/2addr v1, v3

    iget-wide v3, v0, Lcom/tencent/bugly/proguard/U;->r:J

    add-long/2addr v1, v3

    .line 14
    iget-object v3, v0, Lcom/tencent/bugly/proguard/U;->i:Lcom/tencent/bugly/proguard/T;

    iget-boolean v4, v0, Lcom/tencent/bugly/proguard/U;->s:Z

    invoke-virtual {v3, v1, v2, v4}, Lcom/tencent/bugly/proguard/T;->a(JZ)V

    .line 15
    :cond_3
    iget-object v5, v0, Lcom/tencent/bugly/proguard/U;->k:Lcom/tencent/bugly/proguard/P;

    if-eqz v5, :cond_4

    .line 16
    iget v6, v0, Lcom/tencent/bugly/proguard/U;->d:I

    iget-wide v8, v0, Lcom/tencent/bugly/proguard/U;->q:J

    iget-wide v10, v0, Lcom/tencent/bugly/proguard/U;->r:J

    move-object/from16 v7, p1

    move/from16 v12, p2

    move-object/from16 v13, p4

    invoke-interface/range {v5 .. v13}, Lcom/tencent/bugly/proguard/P;->a(ILcom/tencent/bugly/proguard/qa;JJZLjava/lang/String;)V

    .line 17
    :cond_4
    iget-object v12, v0, Lcom/tencent/bugly/proguard/U;->l:Lcom/tencent/bugly/proguard/P;

    if-eqz v12, :cond_5

    .line 18
    iget v13, v0, Lcom/tencent/bugly/proguard/U;->d:I

    iget-wide v1, v0, Lcom/tencent/bugly/proguard/U;->q:J

    iget-wide v3, v0, Lcom/tencent/bugly/proguard/U;->r:J

    move-object/from16 v14, p1

    move/from16 v19, p2

    move-object/from16 v20, p4

    move-wide v15, v1

    move-wide/from16 v17, v3

    invoke-interface/range {v12 .. v20}, Lcom/tencent/bugly/proguard/P;->a(ILcom/tencent/bugly/proguard/qa;JJZLjava/lang/String;)V

    :cond_5
    return-void
.end method

.method public a(Ljava/lang/String;JLjava/lang/String;)V
    .locals 2

    .line 38
    iget p1, p0, Lcom/tencent/bugly/proguard/U;->p:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/bugly/proguard/U;->p:I

    .line 39
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/U;->q:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/U;->q:J

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/qa;Lcom/tencent/bugly/crashreport/common/info/a;Lcom/tencent/bugly/crashreport/common/strategy/c;)Z
    .locals 9

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 19
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "resp == null!"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 20
    :cond_0
    iget-byte v0, p1, Lcom/tencent/bugly/proguard/qa;->c:B

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 21
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "resp result error %d"

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 22
    :cond_1
    :try_start_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/qa;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 23
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/common/info/a;->q()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/tencent/bugly/proguard/qa;->i:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 24
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    move-result-object v3

    sget v4, Lcom/tencent/bugly/crashreport/common/strategy/c;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "device"

    :try_start_1
    iget-object v0, p1, Lcom/tencent/bugly/proguard/qa;->i:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "UTF-8"

    .line 25
    :try_start_2
    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 26
    invoke-virtual/range {v3 .. v8}, Lcom/tencent/bugly/proguard/J;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;Z)Z

    .line 27
    iget-object v0, p1, Lcom/tencent/bugly/proguard/qa;->i:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/tencent/bugly/crashreport/common/info/a;->f(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 28
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 29
    :cond_2
    :goto_0
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/qa;->g:J

    iput-wide v3, p2, Lcom/tencent/bugly/crashreport/common/info/a;->u:J

    .line 30
    iget p2, p1, Lcom/tencent/bugly/proguard/qa;->d:I

    const/16 v0, 0x1fe

    if-ne p2, v0, :cond_5

    .line 31
    iget-object v0, p1, Lcom/tencent/bugly/proguard/qa;->e:[B

    if-nez v0, :cond_3

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "[Upload] Strategy data is null. Response cmd: %d"

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 33
    :cond_3
    const-class p2, Lcom/tencent/bugly/proguard/sa;

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/M;->a([BLjava/lang/Class;)Lcom/tencent/bugly/proguard/m;

    move-result-object p2

    check-cast p2, Lcom/tencent/bugly/proguard/sa;

    if-nez p2, :cond_4

    .line 34
    iget p1, p1, Lcom/tencent/bugly/proguard/qa;->d:I

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "[Upload] Failed to decode strategy from server. Response cmd: %d"

    .line 36
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 37
    :cond_4
    invoke-virtual {p3, p2}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/proguard/sa;)V

    :cond_5
    return v2
.end method

.method public run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "[Upload] Failed to upload for no status header."

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iput v2, v1, Lcom/tencent/bugly/proguard/U;->p:I

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    iput-wide v3, v1, Lcom/tencent/bugly/proguard/U;->q:J

    .line 11
    .line 12
    iput-wide v3, v1, Lcom/tencent/bugly/proguard/U;->r:J

    .line 13
    .line 14
    iget-object v3, v1, Lcom/tencent/bugly/proguard/U;->e:[B

    .line 15
    .line 16
    iget-object v4, v1, Lcom/tencent/bugly/proguard/U;->c:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/info/b;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    const-string v5, "network is not available"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    if-eqz v3, :cond_13

    .line 38
    .line 39
    array-length v4, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_1
    const-string v4, "[Upload] Run upload task with cmd: %d"

    .line 45
    .line 46
    :try_start_2
    iget v5, v1, Lcom/tencent/bugly/proguard/U;->d:I

    .line 47
    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x1

    .line 53
    new-array v7, v6, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v5, v7, v2

    .line 56
    .line 57
    invoke-static {v4, v7}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object v4, v1, Lcom/tencent/bugly/proguard/U;->c:Landroid/content/Context;

    .line 61
    .line 62
    if-eqz v4, :cond_12

    .line 63
    .line 64
    iget-object v4, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 65
    .line 66
    if-eqz v4, :cond_12

    .line 67
    .line 68
    iget-object v4, v1, Lcom/tencent/bugly/proguard/U;->g:Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 69
    .line 70
    if-eqz v4, :cond_12

    .line 71
    .line 72
    iget-object v5, v1, Lcom/tencent/bugly/proguard/U;->h:Lcom/tencent/bugly/proguard/O;

    .line 73
    .line 74
    if-nez v5, :cond_2

    .line 75
    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_2
    invoke-virtual {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 79
    .line 80
    .line 81
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    if-nez v4, :cond_3

    .line 83
    .line 84
    const-string v5, "illegal local strategy"

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    new-instance v5, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    .line 98
    .line 99
    const-string v7, "tls"

    .line 100
    .line 101
    const-string v8, "1"

    .line 102
    .line 103
    :try_start_4
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    .line 105
    .line 106
    const-string v7, "prodId"

    .line 107
    .line 108
    :try_start_5
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 109
    .line 110
    invoke-virtual {v8}, Lcom/tencent/bugly/crashreport/common/info/a;->e()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 115
    .line 116
    .line 117
    const-string v7, "bundleId"

    .line 118
    .line 119
    :try_start_6
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 120
    .line 121
    iget-object v8, v8, Lcom/tencent/bugly/crashreport/common/info/a;->g:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 124
    .line 125
    .line 126
    const-string v7, "appVer"

    .line 127
    .line 128
    :try_start_7
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 129
    .line 130
    iget-object v8, v8, Lcom/tencent/bugly/crashreport/common/info/a;->E:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    iget-object v7, v1, Lcom/tencent/bugly/proguard/U;->o:Ljava/util/Map;

    .line 136
    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_4
    const-string v7, "cmd"

    .line 143
    .line 144
    :try_start_8
    iget v8, v1, Lcom/tencent/bugly/proguard/U;->d:I

    .line 145
    .line 146
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 151
    .line 152
    .line 153
    const-string v7, "platformId"

    .line 154
    .line 155
    :try_start_9
    invoke-static {v6}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 160
    .line 161
    .line 162
    const-string v7, "sdkVer"

    .line 163
    .line 164
    :try_start_a
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 165
    .line 166
    iget-object v8, v8, Lcom/tencent/bugly/crashreport/common/info/a;->l:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 169
    .line 170
    .line 171
    const-string v7, "strategylastUpdateTime"

    .line 172
    .line 173
    :try_start_b
    iget-wide v8, v4, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->o:J

    .line 174
    .line 175
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-virtual {v5, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    const/4 v7, 0x2

    .line 183
    invoke-static {v3, v7}, Lcom/tencent/bugly/proguard/ca;->b([BI)[B

    .line 184
    .line 185
    .line 186
    move-result-object v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 187
    if-nez v3, :cond_5

    .line 188
    .line 189
    const-string v5, "failed to zip request body"

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v4, 0x0

    .line 194
    const/4 v6, 0x0

    .line 195
    :try_start_c
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/U;->a()V

    .line 200
    .line 201
    .line 202
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->m:Ljava/lang/String;

    .line 203
    .line 204
    const/4 v9, -0x1

    .line 205
    const/4 v10, 0x0

    .line 206
    const/4 v11, 0x0

    .line 207
    :goto_0
    add-int/lit8 v12, v10, 0x1

    .line 208
    .line 209
    iget v13, v1, Lcom/tencent/bugly/proguard/U;->a:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 210
    .line 211
    if-ge v10, v13, :cond_11

    .line 212
    .line 213
    if-le v12, v6, :cond_6

    .line 214
    .line 215
    const-string v10, "[Upload] Failed to upload last time, wait and try(%d) again."

    .line 216
    .line 217
    :try_start_d
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    new-array v13, v6, [Ljava/lang/Object;

    .line 222
    .line 223
    aput-object v11, v13, v2

    .line 224
    .line 225
    invoke-static {v10, v13}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    iget v10, v1, Lcom/tencent/bugly/proguard/U;->b:I

    .line 229
    .line 230
    int-to-long v10, v10

    .line 231
    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/ca;->c(J)V

    .line 232
    .line 233
    .line 234
    iget v10, v1, Lcom/tencent/bugly/proguard/U;->a:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 235
    .line 236
    if-ne v12, v10, :cond_6

    .line 237
    .line 238
    const-string v8, "[Upload] Use the back-up url at the last time: %s"

    .line 239
    .line 240
    :try_start_e
    iget-object v10, v1, Lcom/tencent/bugly/proguard/U;->n:Ljava/lang/String;

    .line 241
    .line 242
    new-array v11, v6, [Ljava/lang/Object;

    .line 243
    .line 244
    aput-object v10, v11, v2

    .line 245
    .line 246
    invoke-static {v8, v11}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    iget-object v8, v1, Lcom/tencent/bugly/proguard/U;->n:Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 250
    .line 251
    :cond_6
    const-string v10, "[Upload] Send %d bytes"

    .line 252
    .line 253
    :try_start_f
    array-length v11, v3

    .line 254
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    new-array v13, v6, [Ljava/lang/Object;

    .line 259
    .line 260
    aput-object v11, v13, v2

    .line 261
    .line 262
    invoke-static {v10, v13}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-static {v8}, Lcom/tencent/bugly/proguard/U;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 269
    const-string v10, "[Upload] Upload to %s with cmd %d (pid=%d | tid=%d)."

    .line 270
    .line 271
    :try_start_10
    iget v11, v1, Lcom/tencent/bugly/proguard/U;->d:I

    .line 272
    .line 273
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 286
    .line 287
    .line 288
    move-result v14

    .line 289
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    const/4 v15, 0x4

    .line 294
    new-array v15, v15, [Ljava/lang/Object;

    .line 295
    .line 296
    aput-object v8, v15, v2

    .line 297
    .line 298
    aput-object v11, v15, v6

    .line 299
    .line 300
    aput-object v13, v15, v7

    .line 301
    .line 302
    const/4 v11, 0x3

    .line 303
    aput-object v14, v15, v11

    .line 304
    .line 305
    invoke-static {v10, v15}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    iget-object v10, v1, Lcom/tencent/bugly/proguard/U;->h:Lcom/tencent/bugly/proguard/O;

    .line 309
    .line 310
    invoke-virtual {v10, v8, v3, v1, v5}, Lcom/tencent/bugly/proguard/O;->a(Ljava/lang/String;[BLcom/tencent/bugly/proguard/U;Ljava/util/Map;)[B

    .line 311
    .line 312
    .line 313
    move-result-object v10
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 314
    if-nez v10, :cond_7

    .line 315
    .line 316
    const-string v10, "Failed to upload for no response!"

    .line 317
    .line 318
    :try_start_11
    invoke-virtual {v1, v6, v10}, Lcom/tencent/bugly/proguard/U;->a(ILjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_7
    iget-object v13, v1, Lcom/tencent/bugly/proguard/U;->h:Lcom/tencent/bugly/proguard/O;

    .line 323
    .line 324
    iget-object v13, v13, Lcom/tencent/bugly/proguard/O;->c:Ljava/util/Map;

    .line 325
    .line 326
    invoke-static {v13}, Lcom/tencent/bugly/proguard/U;->a(Ljava/util/Map;)Z

    .line 327
    .line 328
    .line 329
    move-result v14
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 330
    if-nez v14, :cond_9

    .line 331
    .line 332
    const-string v10, "[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d)."

    .line 333
    .line 334
    :try_start_12
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 343
    .line 344
    .line 345
    move-result v14

    .line 346
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v14

    .line 350
    new-array v15, v7, [Ljava/lang/Object;

    .line 351
    .line 352
    aput-object v11, v15, v2

    .line 353
    .line 354
    aput-object v14, v15, v6

    .line 355
    .line 356
    invoke-static {v10, v15}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v6, v0}, Lcom/tencent/bugly/proguard/U;->a(ILjava/lang/String;)V

    .line 360
    .line 361
    .line 362
    if-eqz v13, :cond_8

    .line 363
    .line 364
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    if-eqz v11, :cond_8

    .line 377
    .line 378
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    check-cast v11, Ljava/util/Map$Entry;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 383
    .line 384
    const-string v13, "[key]: %s, [value]: %s"

    .line 385
    .line 386
    :try_start_13
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v14

    .line 390
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    new-array v15, v7, [Ljava/lang/Object;

    .line 395
    .line 396
    aput-object v14, v15, v2

    .line 397
    .line 398
    aput-object v11, v15, v6

    .line 399
    .line 400
    invoke-static {v13, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    new-array v13, v2, [Ljava/lang/Object;

    .line 405
    .line 406
    invoke-static {v11, v13}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_1

    .line 410
    :cond_8
    new-array v10, v2, [Ljava/lang/Object;

    .line 411
    .line 412
    invoke-static {v0, v10}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 413
    .line 414
    .line 415
    :goto_2
    move v10, v12

    .line 416
    const/4 v11, 0x1

    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_9
    const-string v14, "status"

    .line 420
    .line 421
    :try_start_14
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v14

    .line 425
    check-cast v14, Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 428
    .line 429
    .line 430
    move-result v9
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 431
    const-string v14, "[Upload] Status from server is %d (pid=%d | tid=%d)."

    .line 432
    .line 433
    :try_start_15
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v15

    .line 437
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 438
    .line 439
    .line 440
    move-result v16

    .line 441
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v16

    .line 445
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 446
    .line 447
    .line 448
    move-result v17

    .line 449
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v17

    .line 453
    new-array v11, v11, [Ljava/lang/Object;

    .line 454
    .line 455
    aput-object v15, v11, v2

    .line 456
    .line 457
    aput-object v16, v11, v6

    .line 458
    .line 459
    aput-object v17, v11, v7

    .line 460
    .line 461
    invoke-static {v14, v11}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 462
    .line 463
    .line 464
    if-eqz v9, :cond_a

    .line 465
    .line 466
    :try_start_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 469
    .line 470
    .line 471
    const-string v2, "status of server is "

    .line 472
    .line 473
    :try_start_17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    const/4 v2, 0x0

    .line 484
    const/4 v3, 0x0

    .line 485
    const/4 v4, 0x1

    .line 486
    move v6, v9

    .line 487
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 488
    .line 489
    .line 490
    goto/16 :goto_8

    .line 491
    .line 492
    :cond_a
    const-string v0, "[Upload] Received %d bytes"

    .line 493
    .line 494
    :try_start_18
    array-length v1, v10

    .line 495
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    new-array v3, v6, [Ljava/lang/Object;

    .line 500
    .line 501
    aput-object v1, v3, v2

    .line 502
    .line 503
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    array-length v0, v10
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    .line 507
    if-nez v0, :cond_c

    .line 508
    .line 509
    :try_start_19
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-eqz v1, :cond_b

    .line 522
    .line 523
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 528
    .line 529
    const-string v3, "[Upload] HTTP headers from server: key = %s, value = %s"

    .line 530
    .line 531
    :try_start_1a
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    new-array v5, v7, [Ljava/lang/Object;

    .line 540
    .line 541
    aput-object v4, v5, v2

    .line 542
    .line 543
    aput-object v1, v5, v6

    .line 544
    .line 545
    invoke-static {v3, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    .line 546
    .line 547
    .line 548
    goto :goto_3

    .line 549
    :cond_b
    const-string v5, "response data from server is empty"

    .line 550
    .line 551
    const/4 v2, 0x0

    .line 552
    const/4 v3, 0x0

    .line 553
    const/4 v4, 0x1

    .line 554
    const/4 v6, 0x0

    .line 555
    move-object/from16 v1, p0

    .line 556
    .line 557
    :try_start_1b
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 558
    .line 559
    .line 560
    goto/16 :goto_8

    .line 561
    .line 562
    :cond_c
    :try_start_1c
    invoke-static {v10, v7}, Lcom/tencent/bugly/proguard/ca;->a([BI)[B

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    if-eqz v0, :cond_d

    .line 567
    .line 568
    move-object v10, v0

    .line 569
    :cond_d
    invoke-static {v10, v4, v6}, Lcom/tencent/bugly/proguard/M;->a([BLcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)Lcom/tencent/bugly/proguard/qa;

    .line 570
    .line 571
    .line 572
    move-result-object v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    .line 573
    if-nez v0, :cond_e

    .line 574
    .line 575
    const-string v5, "failed to decode response package"

    .line 576
    .line 577
    const/4 v2, 0x0

    .line 578
    const/4 v3, 0x0

    .line 579
    const/4 v4, 0x1

    .line 580
    const/4 v6, 0x0

    .line 581
    move-object/from16 v1, p0

    .line 582
    .line 583
    :try_start_1d
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    .line 584
    .line 585
    .line 586
    goto/16 :goto_8

    .line 587
    .line 588
    :cond_e
    move-object/from16 v1, p0

    .line 589
    .line 590
    const-string v3, "[Upload] Response cmd is: %d, length of sBuffer is: %d"

    .line 591
    .line 592
    :try_start_1e
    iget v4, v0, Lcom/tencent/bugly/proguard/qa;->d:I

    .line 593
    .line 594
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    iget-object v5, v0, Lcom/tencent/bugly/proguard/qa;->e:[B

    .line 599
    .line 600
    if-nez v5, :cond_f

    .line 601
    .line 602
    const/4 v5, 0x0

    .line 603
    goto :goto_4

    .line 604
    :cond_f
    array-length v5, v5

    .line 605
    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    new-array v7, v7, [Ljava/lang/Object;

    .line 610
    .line 611
    aput-object v4, v7, v2

    .line 612
    .line 613
    aput-object v5, v7, v6

    .line 614
    .line 615
    invoke-static {v3, v7}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    iget-object v2, v1, Lcom/tencent/bugly/proguard/U;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 619
    .line 620
    iget-object v3, v1, Lcom/tencent/bugly/proguard/U;->g:Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 621
    .line 622
    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;Lcom/tencent/bugly/crashreport/common/info/a;Lcom/tencent/bugly/crashreport/common/strategy/c;)Z

    .line 623
    .line 624
    .line 625
    move-result v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    .line 626
    if-nez v2, :cond_10

    .line 627
    .line 628
    const-string v5, "failed to process response package"

    .line 629
    .line 630
    const/4 v3, 0x0

    .line 631
    const/4 v4, 0x2

    .line 632
    const/4 v6, 0x0

    .line 633
    move-object v2, v0

    .line 634
    :try_start_1f
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    .line 635
    .line 636
    .line 637
    goto :goto_8

    .line 638
    :cond_10
    move-object v2, v0

    .line 639
    const-string v5, "successfully uploaded"

    .line 640
    .line 641
    const/4 v3, 0x1

    .line 642
    const/4 v4, 0x2

    .line 643
    const/4 v6, 0x0

    .line 644
    move-object/from16 v1, p0

    .line 645
    .line 646
    :try_start_20
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V

    .line 647
    .line 648
    .line 649
    goto :goto_8

    .line 650
    :catchall_1
    move-exception v0

    .line 651
    move-object/from16 v1, p0

    .line 652
    .line 653
    goto :goto_7

    .line 654
    :catchall_2
    new-instance v10, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    .line 657
    .line 658
    .line 659
    const-string v11, "[Upload] Failed to upload for format of status header is invalid: "

    .line 660
    .line 661
    :try_start_21
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v11

    .line 668
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v10

    .line 675
    invoke-virtual {v1, v6, v10}, Lcom/tencent/bugly/proguard/U;->a(ILjava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    .line 676
    .line 677
    .line 678
    goto/16 :goto_2

    .line 679
    .line 680
    :cond_11
    const-string v5, "failed after many attempts"

    .line 681
    .line 682
    const/4 v2, 0x0

    .line 683
    const/4 v3, 0x0

    .line 684
    const/4 v6, 0x0

    .line 685
    move v4, v11

    .line 686
    :try_start_22
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    .line 687
    .line 688
    .line 689
    goto :goto_8

    .line 690
    :cond_12
    :goto_5
    const-string v5, "illegal access error"

    .line 691
    .line 692
    const/4 v2, 0x0

    .line 693
    const/4 v3, 0x0

    .line 694
    const/4 v4, 0x0

    .line 695
    const/4 v6, 0x0

    .line 696
    move-object/from16 v1, p0

    .line 697
    .line 698
    :try_start_23
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :cond_13
    :goto_6
    const-string v5, "request package is empty!"

    .line 703
    .line 704
    const/4 v2, 0x0

    .line 705
    const/4 v3, 0x0

    .line 706
    const/4 v4, 0x0

    .line 707
    const/4 v6, 0x0

    .line 708
    move-object/from16 v1, p0

    .line 709
    .line 710
    :try_start_24
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/proguard/U;->a(Lcom/tencent/bugly/proguard/qa;ZILjava/lang/String;I)V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_0

    .line 711
    .line 712
    .line 713
    return-void

    .line 714
    :goto_7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    if-nez v1, :cond_14

    .line 719
    .line 720
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 721
    .line 722
    .line 723
    :cond_14
    :goto_8
    return-void
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method
