.class public Lcom/tencent/bugly/proguard/e;
.super Lcom/tencent/bugly/proguard/d;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field static i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field

.field static j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected k:Lcom/tencent/bugly/proguard/g;

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/g;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/g;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/tencent/bugly/proguard/e;->l:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iput-short v1, v0, Lcom/tencent/bugly/proguard/g;->d:S

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public a()V
    .locals 2

    .line 4
    invoke-super {p0}, Lcom/tencent/bugly/proguard/d;->a()V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    const/4 v1, 0x3

    iput-short v1, v0, Lcom/tencent/bugly/proguard/g;->d:S

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iput p1, v0, Lcom/tencent/bugly/proguard/g;->g:I

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/k;)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/k;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/l;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/l;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "."

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/tencent/bugly/proguard/d;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "put name can not startwith . , now is "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a([B)V
    .locals 4

    .line 6
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_3

    .line 7
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/k;

    invoke-direct {v0, p1, v1}, Lcom/tencent/bugly/proguard/k;-><init>([BI)V

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d0;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/String;)I

    .line 9
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e;->a(Lcom/tencent/bugly/proguard/k;)V

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iget-short v0, p1, Lcom/tencent/bugly/proguard/g;->d:S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x3

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 11
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/proguard/k;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/g;->j:[B

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/k;-><init>([B)V

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d0;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/String;)I

    .line 13
    sget-object p1, Lcom/tencent/bugly/proguard/e;->i:Ljava/util/HashMap;

    if-nez p1, :cond_0

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    sput-object p1, Lcom/tencent/bugly/proguard/e;->i:Ljava/util/HashMap;

    .line 15
    new-array v1, v3, [B

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    sget-object p1, Lcom/tencent/bugly/proguard/e;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v3, v3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/d;->f:Ljava/util/HashMap;

    return-void

    .line 17
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/k;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/g;->j:[B

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/k;-><init>([B)V

    .line 18
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d0;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/String;)I

    .line 19
    sget-object p1, Lcom/tencent/bugly/proguard/e;->j:Ljava/util/HashMap;

    if-nez p1, :cond_2

    .line 20
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    sput-object p1, Lcom/tencent/bugly/proguard/e;->j:Ljava/util/HashMap;

    .line 21
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    new-array v1, v3, [B

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v1, Lcom/tencent/bugly/proguard/e;->j:Ljava/util/HashMap;

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_2
    sget-object p1, Lcom/tencent/bugly/proguard/e;->j:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v3, v3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/d0;->a:Ljava/util/HashMap;

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/d0;->b:Ljava/util/HashMap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 26
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 27
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "decode package must include size head"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/g;->i:Ljava/lang/String;

    return-void
.end method

.method public b()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iget-short v1, v0, Lcom/tencent/bugly/proguard/g;->d:S

    const-string v2, ""

    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 2
    iget-object v0, v0, Lcom/tencent/bugly/proguard/g;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/g;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "funcName can not is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "servantName can not is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_2
    iget-object v1, v0, Lcom/tencent/bugly/proguard/g;->h:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 7
    iput-object v2, v0, Lcom/tencent/bugly/proguard/g;->h:Ljava/lang/String;

    .line 8
    :cond_3
    iget-object v1, v0, Lcom/tencent/bugly/proguard/g;->i:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 9
    iput-object v2, v0, Lcom/tencent/bugly/proguard/g;->i:Ljava/lang/String;

    .line 10
    :cond_4
    :goto_0
    new-instance v0, Lcom/tencent/bugly/proguard/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/l;-><init>(I)V

    .line 11
    iget-object v2, p0, Lcom/tencent/bugly/proguard/d0;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;)I

    .line 12
    iget-object v2, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    iget-short v2, v2, Lcom/tencent/bugly/proguard/g;->d:S

    if-ne v2, v3, :cond_5

    .line 13
    iget-object v2, p0, Lcom/tencent/bugly/proguard/d0;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/util/Map;I)V

    goto :goto_1

    .line 14
    :cond_5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/d;->f:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/util/Map;I)V

    .line 15
    :goto_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/n;->a(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    iput-object v0, v2, Lcom/tencent/bugly/proguard/g;->j:[B

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/l;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/l;-><init>(I)V

    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;)I

    .line 18
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/e;->a(Lcom/tencent/bugly/proguard/l;)V

    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/n;->a(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    .line 20
    array-length v1, v0

    add-int/lit8 v1, v1, 0x4

    .line 21
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 22
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 23
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/e;->k:Lcom/tencent/bugly/proguard/g;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/tencent/bugly/proguard/g;->h:Ljava/lang/String;

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
