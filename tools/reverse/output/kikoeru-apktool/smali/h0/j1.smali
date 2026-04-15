.class public final Lh0/j1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/e0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx0/w0;

.field public final synthetic c:Lw/k;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;Lw/k;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/j1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/j1;->b:Lx0/w0;

    .line 4
    .line 5
    iput-object p2, p0, Lh0/j1;->c:Lw/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .locals 3

    .line 1
    iget v0, p0, Lh0/j1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh0/j1;->b:Lx0/w0;

    .line 7
    .line 8
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lw/m;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lw/l;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Lw/l;-><init>(Lw/m;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lh0/j1;->c:Lw/k;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lw/k;->b(Lw/j;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Lh0/j1;->b:Lx0/w0;

    .line 32
    .line 33
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lw/m;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    new-instance v2, Lw/l;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lw/l;-><init>(Lw/m;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lh0/j1;->c:Lw/k;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lw/k;->b(Lw/j;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_1
    iget-object v0, p0, Lh0/j1;->b:Lx0/w0;

    .line 57
    .line 58
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lw/m;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    new-instance v2, Lw/l;

    .line 67
    .line 68
    invoke-direct {v2, v1}, Lw/l;-><init>(Lw/m;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lh0/j1;->c:Lw/k;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lw/k;->b(Lw/j;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    const/4 v1, 0x0

    .line 79
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
