.class public final synthetic Lt4/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 9

    .line 1
    check-cast p1, Lt4/k;

    .line 2
    .line 3
    check-cast p2, Lt4/k;

    .line 4
    .line 5
    iget-wide v0, p1, Lt4/k;->f:J

    .line 6
    .line 7
    iget-wide v2, p2, Lt4/k;->f:J

    .line 8
    .line 9
    sub-long v4, v0, v2

    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    cmp-long v8, v4, v6

    .line 14
    .line 15
    if-nez v8, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lt4/k;->a(Lt4/k;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    cmp-long p1, v0, v2

    .line 23
    .line 24
    if-gez p1, :cond_1

    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    return p1

    .line 28
    :cond_1
    const/4 p1, 0x1

    .line 29
    return p1
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
