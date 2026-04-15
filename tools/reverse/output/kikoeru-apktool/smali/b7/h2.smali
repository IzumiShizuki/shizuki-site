.class public final synthetic Lb7/h2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/o2;

.field public final synthetic c:Lb7/z3;


# direct methods
.method public synthetic constructor <init>(Lb7/o2;Lb7/z3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb7/h2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/h2;->b:Lb7/o2;

    .line 4
    .line 5
    iput-object p2, p0, Lb7/h2;->c:Lb7/z3;

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
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lb7/h2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/h2;->b:Lb7/o2;

    .line 7
    .line 8
    iget-object v1, v0, Lb7/o2;->k:Lc7/e1;

    .line 9
    .line 10
    iget-object v2, p0, Lb7/h2;->c:Lb7/z3;

    .line 11
    .line 12
    invoke-virtual {v2}, Lb7/z3;->d()Lc7/p1;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v1, v3}, Lc7/e1;->d0(Lc7/p1;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lb7/z3;->m()Lm4/u0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/16 v3, 0x11

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lm4/u0;->a(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2}, Lb7/z3;->J()Lm4/i1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Lm4/i1;->a:Lm4/e1;

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v0, v1}, Lb7/l2;->s(Lm4/i1;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lb7/h2;->b:Lb7/o2;

    .line 45
    .line 46
    iget-object v0, v0, Lb7/o2;->k:Lc7/e1;

    .line 47
    .line 48
    iget-object v1, p0, Lb7/h2;->c:Lb7/z3;

    .line 49
    .line 50
    invoke-virtual {v1}, Lb7/z3;->d()Lc7/p1;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lc7/e1;->d0(Lc7/p1;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
