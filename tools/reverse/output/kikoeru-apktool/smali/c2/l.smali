.class public final Lc2/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lb7/n;

.field public final c:I

.field public final d:I

.field public e:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lb7/n;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc2/l;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lc2/l;->b:Lb7/n;

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x1d

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object v0, p2, Lb7/n;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/view/MotionEvent;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Landroidx/lifecycle/g0;->d(Landroid/view/MotionEvent;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_1
    iput v0, p0, Lc2/l;->c:I

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget-object v0, p2, Lb7/n;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroid/view/MotionEvent;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move-object v0, v2

    .line 50
    :goto_2
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getButtonState()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    const/4 v0, 0x0

    .line 58
    :goto_3
    iput v0, p0, Lc2/l;->d:I

    .line 59
    .line 60
    if-eqz p2, :cond_4

    .line 61
    .line 62
    iget-object v0, p2, Lb7/n;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 65
    .line 66
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroid/view/MotionEvent;

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_4
    move-object v0, v2

    .line 72
    :goto_4
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getMetaState()I

    .line 75
    .line 76
    .line 77
    :cond_5
    if-eqz p2, :cond_6

    .line 78
    .line 79
    iget-object p2, p2, Lb7/n;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Landroidx/media3/exoplayer/offline/u;

    .line 82
    .line 83
    iget-object p2, p2, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v2, p2

    .line 86
    check-cast v2, Landroid/view/MotionEvent;

    .line 87
    .line 88
    :cond_6
    const/4 p2, 0x3

    .line 89
    const/4 v0, 0x2

    .line 90
    const/4 v1, 0x1

    .line 91
    if-eqz v2, :cond_a

    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_9

    .line 98
    .line 99
    if-eq p1, v1, :cond_8

    .line 100
    .line 101
    if-eq p1, v0, :cond_7

    .line 102
    .line 103
    packed-switch p1, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    goto :goto_8

    .line 107
    :pswitch_0
    const/4 v3, 0x5

    .line 108
    goto :goto_8

    .line 109
    :pswitch_1
    const/4 v3, 0x4

    .line 110
    goto :goto_8

    .line 111
    :pswitch_2
    const/4 v3, 0x6

    .line 112
    goto :goto_8

    .line 113
    :cond_7
    :pswitch_3
    const/4 v3, 0x3

    .line 114
    goto :goto_8

    .line 115
    :cond_8
    :goto_5
    :pswitch_4
    const/4 v3, 0x2

    .line 116
    goto :goto_8

    .line 117
    :cond_9
    :goto_6
    :pswitch_5
    const/4 v3, 0x1

    .line 118
    goto :goto_8

    .line 119
    :cond_a
    move-object v2, p1

    .line 120
    check-cast v2, Ljava/util/Collection;

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_7
    if-ge v3, v2, :cond_7

    .line 127
    .line 128
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Lc2/t;

    .line 133
    .line 134
    invoke-static {v4}, Lc2/s;->c(Lc2/t;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_b

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_b
    invoke-static {v4}, Lc2/s;->a(Lc2/t;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_c

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :goto_8
    iput v3, p0, Lc2/l;->e:I

    .line 152
    .line 153
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
