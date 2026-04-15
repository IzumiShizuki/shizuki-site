.class public final Lcg/q;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcg/v;


# direct methods
.method public synthetic constructor <init>(Lcg/v;Lyb/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcg/q;->e:I

    .line 2
    .line 3
    iput-object p1, p0, Lcg/q;->h:Lcg/v;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 3

    .line 1
    iget v0, p0, Lcg/q;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcg/q;

    .line 7
    .line 8
    iget-object v1, p0, Lcg/q;->h:Lcg/v;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lcg/q;-><init>(Lcg/v;Lyb/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lcg/q;->g:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lcg/q;

    .line 18
    .line 19
    iget-object v1, p0, Lcg/q;->h:Lcg/v;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lcg/q;-><init>(Lcg/v;Lyb/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lcg/q;->g:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lcg/q;

    .line 29
    .line 30
    iget-object v1, p0, Lcg/q;->h:Lcg/v;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v1, p2, v2}, Lcg/q;-><init>(Lcg/v;Lyb/c;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, Lcg/q;->g:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcg/q;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc2/x;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcg/q;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcg/q;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcg/q;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lhf/y;

    .line 24
    .line 25
    check-cast p2, Lyb/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lcg/q;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcg/q;

    .line 32
    .line 33
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcg/q;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lhf/y;

    .line 41
    .line 42
    check-cast p2, Lyb/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lcg/q;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcg/q;

    .line 49
    .line 50
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcg/q;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lcg/q;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lcg/q;->h:Lcg/v;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lzb/a;->a:Lzb/a;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Lub/a0;->a:Lub/a0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcg/q;->f:I

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-ne v0, v4, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    move-object v3, v5

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lc2/x;

    .line 38
    .line 39
    new-instance v7, Lcg/b0;

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    invoke-direct {v7, v1, v0}, Lcg/b0;-><init>(Lcg/v;I)V

    .line 43
    .line 44
    .line 45
    new-instance v8, Lcg/y;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-direct {v8, v1, v0}, Lcg/y;-><init>(Lcg/v;I)V

    .line 49
    .line 50
    .line 51
    new-instance v9, Lcg/y;

    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    invoke-direct {v9, v1, v0}, Lcg/y;-><init>(Lcg/v;I)V

    .line 55
    .line 56
    .line 57
    iput v4, p0, Lcg/q;->f:I

    .line 58
    .line 59
    sget v0, Lu/e0;->a:F

    .line 60
    .line 61
    new-instance v6, Ld0/g;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v11, 0x3

    .line 65
    invoke-direct/range {v6 .. v11}, Ld0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v6, p0}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v3, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move-object p1, v5

    .line 76
    :goto_0
    if-ne p1, v3, :cond_0

    .line 77
    .line 78
    :goto_1
    return-object v3

    .line 79
    :pswitch_0
    iget v0, p0, Lcg/q;->f:I

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    if-ne v0, v4, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lhf/y;

    .line 88
    .line 89
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_5
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v0, p1

    .line 105
    check-cast v0, Lhf/y;

    .line 106
    .line 107
    iput-object v0, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 108
    .line 109
    iput v4, p0, Lcg/q;->f:I

    .line 110
    .line 111
    const-wide/16 v6, 0xfa0

    .line 112
    .line 113
    invoke-static {v6, v7, p0}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v3, :cond_6

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    :goto_2
    invoke-static {v0}, Lhf/a0;->v(Lhf/y;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    iget-object p1, v1, Lcg/v;->r:Lhf/r1;

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    invoke-virtual {p1}, Lhf/k1;->b()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-ne p1, v4, :cond_7

    .line 135
    .line 136
    iget-object p1, v1, Lcg/v;->e:Lx0/e1;

    .line 137
    .line 138
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    move-object v3, v5

    .line 144
    :goto_3
    return-object v3

    .line 145
    :pswitch_1
    iget v0, p0, Lcg/q;->f:I

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    if-ne v0, v4, :cond_8

    .line 150
    .line 151
    iget-object v0, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lhf/y;

    .line 154
    .line 155
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_9
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, Lhf/y;

    .line 171
    .line 172
    move-object v0, p1

    .line 173
    :cond_a
    :goto_4
    invoke-static {v0}, Lhf/a0;->v(Lhf/y;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_b

    .line 178
    .line 179
    invoke-virtual {v1}, Lcg/v;->Y()V

    .line 180
    .line 181
    .line 182
    iput-object v0, p0, Lcg/q;->g:Ljava/lang/Object;

    .line 183
    .line 184
    iput v4, p0, Lcg/q;->f:I

    .line 185
    .line 186
    const-wide/16 v6, 0x3e8

    .line 187
    .line 188
    invoke-static {v6, v7, p0}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-ne p1, v3, :cond_a

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_b
    move-object v3, v5

    .line 196
    :goto_5
    return-object v3

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
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
