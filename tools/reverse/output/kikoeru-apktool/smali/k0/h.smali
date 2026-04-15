.class public final Lk0/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/u1;


# instance fields
.field public final a:J

.field public final b:Ll0/y0;

.field public final c:J

.field public d:Lk0/j;

.field public e:Ll0/n;

.field public final f:Lj1/q;


# direct methods
.method public constructor <init>(JLl0/y0;J)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lk0/h;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lk0/h;->b:Ll0/y0;

    .line 7
    .line 8
    iput-wide p4, p0, Lk0/h;->c:J

    .line 9
    .line 10
    sget-object p4, Lk0/j;->c:Lk0/j;

    .line 11
    .line 12
    iput-object p4, p0, Lk0/h;->d:Lk0/j;

    .line 13
    .line 14
    new-instance p4, Lk0/g;

    .line 15
    .line 16
    const/4 p5, 0x0

    .line 17
    invoke-direct {p4, p0, p5}, Lk0/g;-><init>(Lk0/h;I)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lk0/i;

    .line 21
    .line 22
    invoke-direct {v2, p4, p3, p1, p2}, Lk0/i;-><init>(Lk0/g;Ll0/y0;J)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lj5/x0;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p4, v1, Lj5/x0;->c:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p3, v1, Lj5/x0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    iput-wide p1, v1, Lj5/x0;->b:J

    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    iput-wide p1, v1, Lj5/x0;->a:J

    .line 39
    .line 40
    new-instance v4, Lda/a0;

    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    invoke-direct {v4, p1, v1, v2}, Lda/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lc2/e0;->a:Lc2/l;

    .line 47
    .line 48
    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v5, 0x4

    .line 52
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Li2/a1;->e(Lj1/q;)Lj1/q;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lk0/h;->f:Lj1/q;

    .line 65
    .line 66
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/h;->e:Ll0/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lk0/h;->b:Ll0/y0;

    .line 6
    .line 7
    check-cast v1, Ll0/a1;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ll0/a1;->d(Ll0/n;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lk0/h;->e:Ll0/n;

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

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/h;->e:Ll0/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lk0/h;->b:Ll0/y0;

    .line 6
    .line 7
    check-cast v1, Ll0/a1;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ll0/a1;->d(Ll0/n;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lk0/h;->e:Ll0/n;

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

.method public final d()V
    .locals 8

    .line 1
    new-instance v0, Ll0/n;

    .line 2
    .line 3
    new-instance v1, Lk0/g;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lk0/g;-><init>(Lk0/h;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lk0/g;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-direct {v2, p0, v3}, Lk0/g;-><init>(Lk0/h;I)V

    .line 13
    .line 14
    .line 15
    iget-wide v3, p0, Lk0/h;->a:J

    .line 16
    .line 17
    invoke-direct {v0, v3, v4, v1, v2}, Ll0/n;-><init>(JLk0/g;Lk0/g;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lk0/h;->b:Ll0/y0;

    .line 21
    .line 22
    check-cast v1, Ll0/a1;

    .line 23
    .line 24
    iget-object v2, v1, Ll0/a1;->c:Lo/c0;

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v7, v3, v5

    .line 29
    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, "The selectable contains an invalid id: "

    .line 36
    .line 37
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Lx/a;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v2, v3, v4}, Lo/c0;->b(J)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    new-instance v5, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v6, "Another selectable with the id: "

    .line 59
    .line 60
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v6, ".selectableId has already subscribed."

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v5}, Lx/a;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {v2, v3, v4, v0}, Lo/c0;->h(JLjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v1, Ll0/a1;->b:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    iput-boolean v2, v1, Ll0/a1;->a:Z

    .line 88
    .line 89
    iput-object v0, p0, Lk0/h;->e:Ll0/n;

    .line 90
    .line 91
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
