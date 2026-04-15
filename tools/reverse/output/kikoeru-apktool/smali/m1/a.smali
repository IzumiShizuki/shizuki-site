.class public final Lm1/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Lm1/b;


# instance fields
.field public final a:Lm1/d;

.field public final b:Lo/f;

.field public final c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm1/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lj1/p;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Lm1/d;->q:J

    .line 12
    .line 13
    iput-object v0, p0, Lm1/a;->a:Lm1/d;

    .line 14
    .line 15
    new-instance v0, Lo/f;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lo/f;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lm1/a;->b:Lo/f;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;-><init>(Lm1/a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lm1/a;->c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    .line 29
    .line 30
    return-void
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
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    new-instance p1, Li7/p2;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    sget-object v0, Li2/c2;->a:Li2/c2;

    .line 11
    .line 12
    iget-object v1, p0, Lm1/a;->b:Lo/f;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Lm1/a;->a:Lm1/d;

    .line 16
    .line 17
    packed-switch p2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    return v2

    .line 21
    :pswitch_0
    invoke-virtual {v3, p1}, Lm1/d;->D0(Li7/p2;)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :pswitch_1
    invoke-virtual {v3, p1}, Lm1/d;->C0(Li7/p2;)V

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :pswitch_2
    new-instance p2, La0/f0;

    .line 30
    .line 31
    const/16 v4, 0x19

    .line 32
    .line 33
    invoke-direct {p2, v4, p1}, La0/f0;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v3}, La0/f0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eq p1, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v3, p2}, Li2/f;->C(Li2/d2;Lic/k;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v1}, Lo/f;->clear()V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :pswitch_3
    invoke-virtual {v3, p1}, Lm1/d;->B0(Li7/p2;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_4
    invoke-virtual {v3, p1}, Lm1/d;->E0(Li7/p2;)V

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :pswitch_5
    new-instance p2, Ljc/u;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lc2/e;

    .line 65
    .line 66
    invoke-direct {v2, p1, v3, p2}, Lc2/e;-><init>(Li7/p2;Lm1/d;Ljc/u;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lc2/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eq v4, v0, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v3, v2}, Li2/f;->C(Li2/d2;Lic/k;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-boolean p2, p2, Ljc/u;->a:Z

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lo/a;

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lo/a;-><init>(Lo/f;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Lo/a;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-virtual {v0}, Lo/a;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lm1/d;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lm1/d;->F0(Li7/p2;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    return p2

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
