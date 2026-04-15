.class public final Lb0/w;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Z

.field public h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx0/w0;ZLw/k;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb0/w;->e:I

    .line 1
    iput-object p1, p0, Lb0/w;->i:Ljava/lang/Object;

    iput-boolean p2, p0, Lb0/w;->g:Z

    iput-object p3, p0, Lb0/w;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(ZLb0/a0;Lr/x;Lt1/b;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb0/w;->e:I

    .line 2
    iput-boolean p1, p0, Lb0/w;->g:Z

    iput-object p2, p0, Lb0/w;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb0/w;->i:Ljava/lang/Object;

    iput-object p4, p0, Lb0/w;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 9

    .line 1
    iget p1, p0, Lb0/w;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lb0/w;

    .line 7
    .line 8
    iget-object v0, p0, Lb0/w;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lx0/w0;

    .line 11
    .line 12
    iget-object v1, p0, Lb0/w;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lw/k;

    .line 15
    .line 16
    iget-boolean v2, p0, Lb0/w;->g:Z

    .line 17
    .line 18
    invoke-direct {p1, v0, v2, v1, p2}, Lb0/w;-><init>(Lx0/w0;ZLw/k;Lyb/c;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance v3, Lb0/w;

    .line 23
    .line 24
    iget-object p1, p0, Lb0/w;->h:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Lb0/a0;

    .line 28
    .line 29
    iget-object p1, p0, Lb0/w;->i:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v6, p1

    .line 32
    check-cast v6, Lr/x;

    .line 33
    .line 34
    iget-object p1, p0, Lb0/w;->j:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v7, p1

    .line 37
    check-cast v7, Lt1/b;

    .line 38
    .line 39
    iget-boolean v4, p0, Lb0/w;->g:Z

    .line 40
    .line 41
    move-object v8, p2

    .line 42
    invoke-direct/range {v3 .. v8}, Lb0/w;-><init>(ZLb0/a0;Lr/x;Lt1/b;Lyb/c;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lb0/w;->e:I

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
    invoke-virtual {p0, p1, p2}, Lb0/w;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lb0/w;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lb0/w;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb0/w;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lb0/w;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lb0/w;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lb0/w;->e:I

    .line 2
    .line 3
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v1, p0, Lb0/w;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean v2, p0, Lb0/w;->g:Z

    .line 8
    .line 9
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v7, Lzb/a;->a:Lzb/a;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    iget-object v8, p0, Lb0/w;->i:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v8, Lx0/w0;

    .line 20
    .line 21
    iget v0, p0, Lb0/w;->f:I

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-ne v0, v5, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lb0/w;->h:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v8, v0

    .line 30
    check-cast v8, Lx0/w0;

    .line 31
    .line 32
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lw/m;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast v1, Lw/k;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    new-instance v2, Lw/n;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lw/n;-><init>(Lw/m;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v2, Lw/l;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Lw/l;-><init>(Lw/m;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iput-object v8, p0, Lb0/w;->h:Ljava/lang/Object;

    .line 71
    .line 72
    iput v5, p0, Lb0/w;->f:I

    .line 73
    .line 74
    invoke-virtual {v1, v2, p0}, Lw/k;->a(Lw/j;Lyb/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v7, :cond_3

    .line 79
    .line 80
    move-object v6, v7

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 83
    invoke-interface {v8, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_2
    return-object v6

    .line 87
    :pswitch_0
    iget-object v0, p0, Lb0/w;->h:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v9, v0

    .line 90
    check-cast v9, Lb0/a0;

    .line 91
    .line 92
    iget v0, p0, Lb0/w;->f:I

    .line 93
    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x2

    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    if-eq v0, v5, :cond_6

    .line 99
    .line 100
    if-ne v0, v11, :cond_5

    .line 101
    .line 102
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto :goto_7

    .line 108
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_6
    :try_start_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    :try_start_2
    iget-object v0, v9, Lb0/a0;->p:Lr/c;

    .line 124
    .line 125
    new-instance v2, Ljava/lang/Float;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 129
    .line 130
    .line 131
    iput v5, p0, Lb0/w;->f:I

    .line 132
    .line 133
    invoke-virtual {v0, v2, p0}, Lr/c;->f(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-ne v0, v7, :cond_8

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    :goto_3
    iget-object v0, v9, Lb0/a0;->p:Lr/c;

    .line 141
    .line 142
    move-object v2, v1

    .line 143
    new-instance v1, Ljava/lang/Float;

    .line 144
    .line 145
    const/high16 v3, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 148
    .line 149
    .line 150
    check-cast v8, Lr/x;

    .line 151
    .line 152
    new-instance v3, Lb0/v;

    .line 153
    .line 154
    check-cast v2, Lt1/b;

    .line 155
    .line 156
    invoke-direct {v3, v2, v9, v10}, Lb0/v;-><init>(Lt1/b;Lb0/a0;I)V

    .line 157
    .line 158
    .line 159
    iput v11, p0, Lb0/w;->f:I

    .line 160
    .line 161
    const/4 v5, 0x4

    .line 162
    move-object v4, p0

    .line 163
    move-object v2, v8

    .line 164
    invoke-static/range {v0 .. v5}, Lr/c;->d(Lr/c;Ljava/lang/Object;Lr/j;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    if-ne v0, v7, :cond_9

    .line 169
    .line 170
    :goto_4
    move-object v6, v7

    .line 171
    goto :goto_6

    .line 172
    :cond_9
    :goto_5
    sget v0, Lb0/a0;->t:I

    .line 173
    .line 174
    invoke-virtual {v9, v10}, Lb0/a0;->d(Z)V

    .line 175
    .line 176
    .line 177
    :goto_6
    return-object v6

    .line 178
    :goto_7
    sget v1, Lb0/a0;->t:I

    .line 179
    .line 180
    invoke-virtual {v9, v10}, Lb0/a0;->d(Z)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
