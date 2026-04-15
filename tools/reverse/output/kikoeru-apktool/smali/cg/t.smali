.class public final Lcg/t;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Z

.field public synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLyb/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcg/t;->e:I

    iput-object p1, p0, Lcg/t;->g:Ljava/lang/Object;

    iput-boolean p2, p0, Lcg/t;->f:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(ZLcg/v;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcg/t;->e:I

    .line 2
    iput-boolean p1, p0, Lcg/t;->f:Z

    iput-object p2, p0, Lcg/t;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(ZLyb/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcg/t;->e:I

    .line 3
    iput-boolean p1, p0, Lcg/t;->f:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 3

    .line 1
    iget v0, p0, Lcg/t;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcg/t;

    .line 7
    .line 8
    iget-boolean v1, p0, Lcg/t;->f:Z

    .line 9
    .line 10
    invoke-direct {v0, v1, p2}, Lcg/t;-><init>(ZLyb/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcg/t;->g:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance p1, Lcg/t;

    .line 17
    .line 18
    iget-object v0, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroid/app/Activity;

    .line 21
    .line 22
    iget-boolean v1, p0, Lcg/t;->f:Z

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-direct {p1, v0, v1, p2, v2}, Lcg/t;-><init>(Ljava/lang/Object;ZLyb/c;I)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_1
    new-instance p1, Lcg/t;

    .line 30
    .line 31
    iget-object v0, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Le/k;

    .line 34
    .line 35
    iget-boolean v1, p0, Lcg/t;->f:Z

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {p1, v0, v1, p2, v2}, Lcg/t;-><init>(Ljava/lang/Object;ZLyb/c;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    new-instance p1, Lcg/t;

    .line 43
    .line 44
    iget-object v0, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcg/v;

    .line 47
    .line 48
    iget-boolean v1, p0, Lcg/t;->f:Z

    .line 49
    .line 50
    invoke-direct {p1, v1, v0, p2}, Lcg/t;-><init>(ZLcg/v;Lyb/c;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcg/t;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcg/t;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcg/t;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcg/t;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lcg/t;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcg/t;

    .line 27
    .line 28
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lcg/t;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lcg/t;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcg/t;

    .line 39
    .line 40
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lcg/t;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lcg/t;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcg/t;

    .line 51
    .line 52
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lcg/t;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcg/t;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 7
    .line 8
    iget-object v1, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lhf/y;

    .line 11
    .line 12
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, Lcg/t;->f:Z

    .line 16
    .line 17
    :try_start_0
    sget-object v1, Lna/v;->a:Lna/v;

    .line 18
    .line 19
    invoke-static {v1, p1}, Lna/v;->a(Lna/v;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    move-object p1, v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-static {p1}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-static {p1}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object v0

    .line 39
    :pswitch_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/app/Activity;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-wide v1, Lq1/q;->g:J

    .line 51
    .line 52
    invoke-static {v1, v2}, Lq1/h0;->B(J)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v1, v2}, Lq1/h0;->B(J)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v1, Lr/y1;

    .line 83
    .line 84
    invoke-direct {v1, p1}, Lr/y1;-><init>(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v2, 0x23

    .line 90
    .line 91
    if-lt p1, v2, :cond_1

    .line 92
    .line 93
    new-instance p1, Lu3/a1;

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-direct {p1, v0, v1, v2}, Lu3/x0;-><init>(Landroid/view/Window;Lr/y1;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const/16 v2, 0x1e

    .line 101
    .line 102
    if-lt p1, v2, :cond_2

    .line 103
    .line 104
    new-instance p1, Lu3/x0;

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    invoke-direct {p1, v0, v1, v2}, Lu3/x0;-><init>(Landroid/view/Window;Lr/y1;I)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const/16 v2, 0x1a

    .line 112
    .line 113
    if-lt p1, v2, :cond_3

    .line 114
    .line 115
    new-instance p1, Lu3/z0;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-direct {p1, v0, v1, v2}, Lu3/x0;-><init>(Landroid/view/Window;Lr/y1;I)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    const/16 v2, 0x17

    .line 123
    .line 124
    if-lt p1, v2, :cond_4

    .line 125
    .line 126
    new-instance p1, Lu3/y0;

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {p1, v0, v1, v2}, Lu3/x0;-><init>(Landroid/view/Window;Lr/y1;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p1, Lu3/x0;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-direct {p1, v0, v1, v2}, Lu3/x0;-><init>(Landroid/view/Window;Lr/y1;I)V

    .line 137
    .line 138
    .line 139
    :goto_1
    iget-boolean v0, p0, Lcg/t;->f:Z

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Lu3/x0;->C(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Lu3/x0;->A(Z)V

    .line 145
    .line 146
    .line 147
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 148
    .line 149
    return-object p1

    .line 150
    :pswitch_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p1, Le/k;

    .line 156
    .line 157
    iget-boolean v0, p0, Lcg/t;->f:Z

    .line 158
    .line 159
    if-nez v0, :cond_5

    .line 160
    .line 161
    iget-boolean v1, p1, Le/k;->g:Z

    .line 162
    .line 163
    if-nez v1, :cond_5

    .line 164
    .line 165
    iget-boolean v1, p1, Ld/b0;->a:Z

    .line 166
    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    iget-object v1, p1, Le/k;->f:Lb7/n;

    .line 170
    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    invoke-virtual {v1}, Lb7/n;->c()V

    .line 174
    .line 175
    .line 176
    :cond_5
    iput-boolean v0, p1, Ld/b0;->a:Z

    .line 177
    .line 178
    iget-object p1, p1, Ld/b0;->c:Ljc/j;

    .line 179
    .line 180
    if-eqz p1, :cond_6

    .line 181
    .line 182
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 186
    .line 187
    return-object p1

    .line 188
    :pswitch_2
    iget-object v0, p0, Lcg/t;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lcg/v;

    .line 191
    .line 192
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-boolean p1, p0, Lcg/t;->f:Z

    .line 196
    .line 197
    if-eqz p1, :cond_7

    .line 198
    .line 199
    sget-object p1, Lcg/o;->b:Lcg/o;

    .line 200
    .line 201
    iget-object v1, v0, Lcg/v;->d:Lx0/e1;

    .line 202
    .line 203
    invoke-virtual {v1, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lcg/v;->X()V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_7
    sget-object p1, Lcg/o;->a:Lcg/o;

    .line 211
    .line 212
    iget-object v1, v0, Lcg/v;->d:Lx0/e1;

    .line 213
    .line 214
    invoke-virtual {v1, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Lcg/v;->X()V

    .line 218
    .line 219
    .line 220
    :goto_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 221
    .line 222
    return-object p1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
