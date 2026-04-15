.class public final Ls4/k;
.super Ljava/io/InputStream;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ls4/h;

.field public final b:Ls4/m;

.field public final c:[B

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Ls4/h;Ls4/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ls4/k;->d:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Ls4/k;->e:Z

    .line 8
    .line 9
    iput-object p1, p0, Ls4/k;->a:Ls4/h;

    .line 10
    .line 11
    iput-object p2, p0, Ls4/k;->b:Ls4/m;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, Ls4/k;->c:[B

    .line 17
    .line 18
    return-void
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
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ls4/k;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ls4/k;->a:Ls4/h;

    .line 6
    .line 7
    iget-object v1, p0, Ls4/k;->b:Ls4/m;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ls4/h;->f(Ls4/m;)J

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Ls4/k;->d:Z

    .line 14
    .line 15
    :cond_0
    return-void
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

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls4/k;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ls4/k;->a:Ls4/h;

    .line 6
    .line 7
    invoke-interface {v0}, Ls4/h;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ls4/k;->e:Z

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final read()I
    .locals 4

    .line 1
    iget-object v0, p0, Ls4/k;->c:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ls4/k;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return v3

    .line 2
    :cond_0
    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 3
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ls4/k;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 1

    .line 4
    iget-boolean v0, p0, Ls4/k;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 5
    invoke-virtual {p0}, Ls4/k;->b()V

    .line 6
    iget-object v0, p0, Ls4/k;->a:Ls4/h;

    invoke-interface {v0, p1, p2, p3}, Lm4/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return p1
.end method
