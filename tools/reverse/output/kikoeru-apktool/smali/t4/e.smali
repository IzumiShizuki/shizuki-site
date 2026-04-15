.class public final Lt4/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/g;


# instance fields
.field public a:Lt4/b;

.field public final b:Ls4/s;

.field public c:Lr/y1;

.field public d:Z

.field public e:Ls4/g;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls4/s;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt4/e;->b:Ls4/s;

    .line 10
    .line 11
    return-void
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
.method public final a()Lt4/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/e;->e:Ls4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ls4/g;->q()Ls4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lt4/e;->f:I

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lt4/e;->b(Ls4/h;I)Lt4/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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

.method public final b(Ls4/h;I)Lt4/f;
    .locals 6

    .line 1
    iget-object v1, p0, Lt4/e;->a:Lt4/b;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lt4/e;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Lt4/e;->c:Lr/y1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v2, Lt4/d;

    .line 18
    .line 19
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lt4/y;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v0}, Lt4/d;-><init>(Lt4/b;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    move-object v4, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    new-instance v2, Lt4/d;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lt4/d;-><init>(Lt4/b;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 38
    goto :goto_0

    .line 39
    :goto_2
    new-instance v0, Lt4/f;

    .line 40
    .line 41
    iget-object v2, p0, Lt4/e;->b:Ls4/s;

    .line 42
    .line 43
    invoke-virtual {v2}, Ls4/s;->q()Ls4/h;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v2, p1

    .line 48
    move v5, p2

    .line 49
    invoke-direct/range {v0 .. v5}, Lt4/f;-><init>(Lt4/b;Ls4/h;Ls4/h;Lt4/d;I)V

    .line 50
    .line 51
    .line 52
    return-object v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final q()Ls4/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/e;->e:Ls4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ls4/g;->q()Ls4/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lt4/e;->f:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lt4/e;->b(Ls4/h;I)Lt4/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
