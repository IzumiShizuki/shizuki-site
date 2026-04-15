.class public final Lcom/tencent/bugly/proguard/z;
.super Lcom/tencent/bugly/proguard/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field static a:Lcom/tencent/bugly/proguard/y; = null

.field static b:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final synthetic c:Z = true


# instance fields
.field public d:Ljava/lang/String;

.field public e:J

.field public f:B

.field public g:J

.field public h:Lcom/tencent/bugly/proguard/y;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 3
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/z;->e:J

    const/4 v3, 0x0

    .line 4
    iput-byte v3, p0, Lcom/tencent/bugly/proguard/z;->f:B

    .line 5
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/z;->g:J

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    .line 8
    iput v3, p0, Lcom/tencent/bugly/proguard/z;->j:I

    .line 9
    iput-object v1, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JBJ",
            "Lcom/tencent/bugly/proguard/y;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    .line 12
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/z;->e:J

    .line 13
    iput-byte p4, p0, Lcom/tencent/bugly/proguard/z;->f:B

    .line 14
    iput-wide p5, p0, Lcom/tencent/bugly/proguard/z;->g:J

    .line 15
    iput-object p7, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    .line 16
    iput-object p8, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    .line 17
    iput p9, p0, Lcom/tencent/bugly/proguard/z;->j:I

    .line 18
    iput-object p10, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/k;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    .line 13
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/z;->e:J

    invoke-virtual {p1, v2, v3, v1, v1}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/z;->e:J

    .line 14
    iget-byte v2, p0, Lcom/tencent/bugly/proguard/z;->f:B

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/k;->a(BIZ)B

    move-result v1

    iput-byte v1, p0, Lcom/tencent/bugly/proguard/z;->f:B

    .line 15
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/z;->g:J

    const/4 v3, 0x3

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/z;->g:J

    .line 16
    sget-object v1, Lcom/tencent/bugly/proguard/z;->a:Lcom/tencent/bugly/proguard/y;

    if-nez v1, :cond_0

    .line 17
    new-instance v1, Lcom/tencent/bugly/proguard/y;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/y;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/z;->a:Lcom/tencent/bugly/proguard/y;

    .line 18
    :cond_0
    sget-object v1, Lcom/tencent/bugly/proguard/z;->a:Lcom/tencent/bugly/proguard/y;

    const/4 v2, 0x4

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/y;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    const/4 v1, 0x5

    .line 19
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    .line 20
    iget v1, p0, Lcom/tencent/bugly/proguard/z;->j:I

    const/4 v2, 0x6

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/z;->j:I

    .line 21
    sget-object v1, Lcom/tencent/bugly/proguard/z;->b:Ljava/util/Map;

    if-nez v1, :cond_1

    .line 22
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/z;->b:Ljava/util/Map;

    .line 23
    const-string v2, ""

    invoke-interface {v1, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_1
    sget-object v1, Lcom/tencent/bugly/proguard/z;->b:Ljava/util/Map;

    const/4 v2, 0x7

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/z;->e:J

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/l;->a(JI)V

    .line 3
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/z;->f:B

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(BI)V

    .line 4
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/z;->g:J

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/l;->a(JI)V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x5

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 9
    :cond_1
    iget v0, p0, Lcom/tencent/bugly/proguard/z;->j:I

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(II)V

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    if-eqz v0, :cond_2

    const/4 v1, 0x7

    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/util/Map;I)V

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 25
    new-instance v0, Lcom/tencent/bugly/proguard/i;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;-><init>(Ljava/lang/StringBuilder;I)V

    .line 26
    iget-object p1, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    const-string p2, "eventType"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 27
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/z;->e:J

    const-string v1, "eventTime"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/i;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 28
    iget-byte p1, p0, Lcom/tencent/bugly/proguard/z;->f:B

    const-string p2, "eventResult"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(BLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 29
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/z;->g:J

    const-string v1, "eventElapse"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/i;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 30
    iget-object p1, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    const-string p2, "destAppInfo"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 31
    iget-object p1, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    const-string p2, "strategyId"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 32
    iget p1, p0, Lcom/tencent/bugly/proguard/z;->j:I

    const-string p2, "updateType"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 33
    iget-object p1, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    const-string p2, "reserved"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/z;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p1, Lcom/tencent/bugly/proguard/z;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p1, Lcom/tencent/bugly/proguard/z;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/z;->e:J

    .line 18
    .line 19
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/z;->e:J

    .line 20
    .line 21
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/n;->a(JJ)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-byte v1, p0, Lcom/tencent/bugly/proguard/z;->f:B

    .line 28
    .line 29
    iget-byte v2, p1, Lcom/tencent/bugly/proguard/z;->f:B

    .line 30
    .line 31
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(BB)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/z;->g:J

    .line 38
    .line 39
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/z;->g:J

    .line 40
    .line 41
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/n;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    .line 48
    .line 49
    iget-object v2, p1, Lcom/tencent/bugly/proguard/z;->h:Lcom/tencent/bugly/proguard/y;

    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v2, p1, Lcom/tencent/bugly/proguard/z;->i:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    iget v1, p0, Lcom/tencent/bugly/proguard/z;->j:I

    .line 68
    .line 69
    iget v2, p1, Lcom/tencent/bugly/proguard/z;->j:I

    .line 70
    .line 71
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(II)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/tencent/bugly/proguard/z;->k:Ljava/util/Map;

    .line 80
    .line 81
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    return p1

    .line 89
    :cond_1
    return v0
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

.method public hashCode()I
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/Exception;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const-string v1, "Need define key first!"

    .line 4
    .line 5
    :try_start_1
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
