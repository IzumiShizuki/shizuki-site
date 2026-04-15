.class public final Lcom/tencent/bugly/proguard/D;
.super Lcom/tencent/bugly/proguard/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field static a:Lcom/tencent/bugly/proguard/sa; = null

.field static b:Lcom/tencent/bugly/proguard/B; = null

.field static final synthetic c:Z = true


# instance fields
.field public d:Lcom/tencent/bugly/proguard/sa;

.field public e:Lcom/tencent/bugly/proguard/B;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/k;)V
    .locals 3

    .line 5
    sget-object v0, Lcom/tencent/bugly/proguard/D;->a:Lcom/tencent/bugly/proguard/sa;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/sa;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/sa;-><init>()V

    sput-object v0, Lcom/tencent/bugly/proguard/D;->a:Lcom/tencent/bugly/proguard/sa;

    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/D;->a:Lcom/tencent/bugly/proguard/sa;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/sa;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/D;->b:Lcom/tencent/bugly/proguard/B;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/B;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/B;-><init>()V

    sput-object v0, Lcom/tencent/bugly/proguard/D;->b:Lcom/tencent/bugly/proguard/B;

    .line 10
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/D;->b:Lcom/tencent/bugly/proguard/B;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/B;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 1

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/i;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;-><init>(Ljava/lang/StringBuilder;I)V

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    const-string p2, "baseStrategy"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 13
    iget-object p1, p0, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    const-string p2, "grayStrategy"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

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
    sget-boolean v0, Lcom/tencent/bugly/proguard/D;->c:Z

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
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p1, Lcom/tencent/bugly/proguard/D;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

    .line 8
    .line 9
    iget-object v2, p1, Lcom/tencent/bugly/proguard/D;->d:Lcom/tencent/bugly/proguard/sa;

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
    iget-object v1, p0, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/tencent/bugly/proguard/D;->e:Lcom/tencent/bugly/proguard/B;

    .line 20
    .line 21
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    return v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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
