.class public abstract Lh1/d0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh1/v;Ljava/util/Iterator;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lh1/d0;->b:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lh1/d0;->c:Ljava/lang/Object;

    .line 10
    invoke-virtual {p1}, Lh1/v;->d()Lh1/u;

    move-result-object p1

    .line 11
    iget p1, p1, Lh1/u;->d:I

    .line 12
    iput p1, p0, Lh1/d0;->a:I

    .line 13
    invoke-virtual {p0}, Lh1/d0;->a()V

    return-void
.end method

.method public constructor <init>(Lr/y1;ILr/y1;[ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh1/d0;->b:Ljava/lang/Object;

    .line 3
    iput p2, p0, Lh1/d0;->a:I

    .line 4
    iput-object p3, p0, Lh1/d0;->c:Ljava/lang/Object;

    .line 5
    invoke-virtual {p4}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lh1/d0;->d:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Lh1/d0;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh1/d0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    .line 5
    iput-object v0, p0, Lh1/d0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, p0, Lh1/d0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Iterator;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iput-object v0, p0, Lh1/d0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh1/d0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh1/d0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/v;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh1/v;->d()Lh1/u;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lh1/u;->d:I

    .line 10
    .line 11
    iget v2, p0, Lh1/d0;->a:I

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lh1/d0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/Map$Entry;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lh1/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, p0, Lh1/d0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v0}, Lh1/v;->d()Lh1/u;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, Lh1/u;->d:I

    .line 36
    .line 37
    iput v0, p0, Lh1/d0;->a:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
.end method
