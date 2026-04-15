.class public final Lc2/g0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Lyb/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc2/g0;->e:I

    iput-wide p1, p0, Lc2/g0;->g:J

    iput-object p3, p0, Lc2/g0;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLyb/c;I)V
    .locals 0

    .line 2
    iput p5, p0, Lc2/g0;->e:I

    iput-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    iput-wide p2, p0, Lc2/g0;->g:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 7

    .line 1
    iget p1, p0, Lc2/g0;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc2/g0;

    .line 7
    .line 8
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lz9/r;

    .line 12
    .line 13
    iget-wide v2, p0, Lc2/g0;->g:J

    .line 14
    .line 15
    const/4 v5, 0x6

    .line 16
    move-object v4, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v5, p2

    .line 22
    new-instance v1, Lc2/g0;

    .line 23
    .line 24
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, Luh/y;

    .line 28
    .line 29
    iget-wide v3, p0, Lc2/g0;->g:J

    .line 30
    .line 31
    const/4 v6, 0x5

    .line 32
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    move-object v5, p2

    .line 37
    new-instance v1, Lc2/g0;

    .line 38
    .line 39
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v2, p1

    .line 42
    check-cast v2, Ln9/e;

    .line 43
    .line 44
    iget-wide v3, p0, Lc2/g0;->g:J

    .line 45
    .line 46
    const/4 v6, 0x4

    .line 47
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_2
    move-object v5, p2

    .line 52
    new-instance v1, Lc2/g0;

    .line 53
    .line 54
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v2, p1

    .line 57
    check-cast v2, Lr/c;

    .line 58
    .line 59
    iget-wide v3, p0, Lc2/g0;->g:J

    .line 60
    .line 61
    const/4 v6, 0x3

    .line 62
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_3
    move-object v5, p2

    .line 67
    new-instance v1, Lc2/g0;

    .line 68
    .line 69
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    check-cast v2, Li3/h;

    .line 73
    .line 74
    iget-wide v3, p0, Lc2/g0;->g:J

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_4
    move-object v5, p2

    .line 82
    new-instance v1, Lc2/g0;

    .line 83
    .line 84
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v4, p1

    .line 87
    check-cast v4, Lx0/w0;

    .line 88
    .line 89
    const/4 v6, 0x1

    .line 90
    iget-wide v2, p0, Lc2/g0;->g:J

    .line 91
    .line 92
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(JLjava/lang/Object;Lyb/c;I)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_5
    move-object v5, p2

    .line 97
    new-instance v1, Lc2/g0;

    .line 98
    .line 99
    iget-object p1, p0, Lc2/g0;->h:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v4, p1

    .line 102
    check-cast v4, Lc2/i0;

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    iget-wide v2, p0, Lc2/g0;->g:J

    .line 106
    .line 107
    invoke-direct/range {v1 .. v6}, Lc2/g0;-><init>(JLjava/lang/Object;Lyb/c;I)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc2/g0;->e:I

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
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc2/g0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lc2/g0;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lc2/g0;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lc2/g0;

    .line 54
    .line 55
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lc2/g0;

    .line 67
    .line 68
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lc2/g0;

    .line 80
    .line 81
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lc2/g0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lc2/g0;

    .line 93
    .line 94
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lc2/g0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, Lc2/g0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v6, 0x0

    .line 8
    iget-object v3, v4, Lc2/g0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 11
    .line 12
    iget-wide v8, v4, Lc2/g0;->g:J

    .line 13
    .line 14
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    sget-object v10, Lzb/a;->a:Lzb/a;

    .line 17
    .line 18
    const/4 v11, 0x1

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget v0, v4, Lc2/g0;->f:I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v11, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast v3, Lz9/r;

    .line 42
    .line 43
    iput v11, v4, Lc2/g0;->f:I

    .line 44
    .line 45
    invoke-virtual {v3, v8, v9, v4}, Lz9/r;->z(JLac/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v10, :cond_2

    .line 50
    .line 51
    move-object v7, v10

    .line 52
    :cond_2
    :goto_0
    return-object v7

    .line 53
    :pswitch_0
    move-object v12, v3

    .line 54
    check-cast v12, Luh/y;

    .line 55
    .line 56
    iget v0, v4, Lc2/g0;->f:I

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    if-eq v0, v11, :cond_4

    .line 61
    .line 62
    if-ne v0, v2, :cond_3

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_4
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v12, Luh/y;->s:Lr/c;

    .line 82
    .line 83
    new-instance v1, Lp1/b;

    .line 84
    .line 85
    invoke-direct {v1, v8, v9}, Lp1/b;-><init>(J)V

    .line 86
    .line 87
    .line 88
    iput v11, v4, Lc2/g0;->f:I

    .line 89
    .line 90
    invoke-virtual {v0, v1, v4}, Lr/c;->f(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v10, :cond_6

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    :goto_1
    iget-object v0, v12, Luh/y;->s:Lr/c;

    .line 98
    .line 99
    new-instance v1, Lp1/b;

    .line 100
    .line 101
    const-wide/16 v8, 0x0

    .line 102
    .line 103
    invoke-direct {v1, v8, v9}, Lp1/b;-><init>(J)V

    .line 104
    .line 105
    .line 106
    const/high16 v3, 0x3f000000    # 0.5f

    .line 107
    .line 108
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    int-to-long v8, v5

    .line 113
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-long v13, v3

    .line 118
    const/16 v3, 0x20

    .line 119
    .line 120
    shl-long/2addr v8, v3

    .line 121
    const-wide v15, 0xffffffffL

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    and-long/2addr v13, v15

    .line 127
    or-long/2addr v8, v13

    .line 128
    new-instance v3, Lp1/b;

    .line 129
    .line 130
    invoke-direct {v3, v8, v9}, Lp1/b;-><init>(J)V

    .line 131
    .line 132
    .line 133
    invoke-static {v11, v3}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iput v2, v4, Lc2/g0;->f:I

    .line 138
    .line 139
    move-object v2, v3

    .line 140
    const/4 v3, 0x0

    .line 141
    const/16 v5, 0xc

    .line 142
    .line 143
    invoke-static/range {v0 .. v5}, Lr/c;->d(Lr/c;Ljava/lang/Object;Lr/j;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v10, :cond_7

    .line 148
    .line 149
    :goto_2
    move-object v7, v10

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    :goto_3
    iget-object v0, v12, Luh/y;->r:Lx0/e1;

    .line 152
    .line 153
    invoke-virtual {v0, v6}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :goto_4
    return-object v7

    .line 157
    :pswitch_1
    iget v0, v4, Lc2/g0;->f:I

    .line 158
    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    if-ne v0, v11, :cond_8

    .line 162
    .line 163
    :try_start_0
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    goto :goto_6

    .line 171
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_9
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    const v0, 0x7f0c01ae

    .line 181
    .line 182
    .line 183
    :try_start_1
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    const/16 v16, 0x0

    .line 188
    .line 189
    const/16 v17, 0x1ff

    .line 190
    .line 191
    const-wide/16 v13, 0x0

    .line 192
    .line 193
    const/4 v15, 0x0

    .line 194
    invoke-static/range {v12 .. v17}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    iput v11, v4, Lc2/g0;->f:I

    .line 198
    .line 199
    sget-object v0, Ln9/e;->c:[Lpc/u;

    .line 200
    .line 201
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 202
    .line 203
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 204
    .line 205
    new-instance v2, Ln9/c;

    .line 206
    .line 207
    invoke-direct {v2, v8, v9, v6}, Ln9/c;-><init>(JLyb/c;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v2, v4}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v10, :cond_a

    .line 215
    .line 216
    move-object v7, v10

    .line 217
    goto :goto_8

    .line 218
    :cond_a
    :goto_5
    check-cast v0, Ljava/lang/Number;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    new-instance v2, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    .line 228
    .line 229
    goto :goto_7

    .line 230
    :goto_6
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :goto_7
    instance-of v0, v2, Lub/m;

    .line 235
    .line 236
    if-nez v0, :cond_b

    .line 237
    .line 238
    move-object v0, v2

    .line 239
    check-cast v0, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    new-instance v3, Ljava/lang/Integer;

    .line 246
    .line 247
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 248
    .line 249
    .line 250
    new-array v0, v11, [Ljava/lang/Object;

    .line 251
    .line 252
    aput-object v3, v0, v1

    .line 253
    .line 254
    const v1, 0x7f0c00c7

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v0}, Lna/q;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    const/4 v12, 0x0

    .line 262
    const/16 v13, 0x1ff

    .line 263
    .line 264
    const-wide/16 v9, 0x0

    .line 265
    .line 266
    const/4 v11, 0x0

    .line 267
    invoke-static/range {v8 .. v13}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 268
    .line 269
    .line 270
    :cond_b
    invoke-static {v2}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-eqz v0, :cond_c

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 277
    .line 278
    .line 279
    const v0, 0x7f0c019b

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    const/4 v12, 0x0

    .line 287
    const/16 v13, 0x1ff

    .line 288
    .line 289
    const-wide/16 v9, 0x0

    .line 290
    .line 291
    const/4 v11, 0x0

    .line 292
    invoke-static/range {v8 .. v13}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 293
    .line 294
    .line 295
    :cond_c
    :goto_8
    return-object v7

    .line 296
    :pswitch_2
    iget v0, v4, Lc2/g0;->f:I

    .line 297
    .line 298
    if-eqz v0, :cond_e

    .line 299
    .line 300
    if-ne v0, v11, :cond_d

    .line 301
    .line 302
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 307
    .line 308
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0

    .line 312
    :cond_e
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    move-object v0, v3

    .line 316
    check-cast v0, Lr/c;

    .line 317
    .line 318
    new-instance v1, Lp1/b;

    .line 319
    .line 320
    invoke-direct {v1, v8, v9}, Lp1/b;-><init>(J)V

    .line 321
    .line 322
    .line 323
    sget-object v2, Ll0/p0;->d:Lr/z0;

    .line 324
    .line 325
    iput v11, v4, Lc2/g0;->f:I

    .line 326
    .line 327
    const/4 v3, 0x0

    .line 328
    const/16 v5, 0xc

    .line 329
    .line 330
    invoke-static/range {v0 .. v5}, Lr/c;->d(Lr/c;Ljava/lang/Object;Lr/j;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-ne v0, v10, :cond_f

    .line 335
    .line 336
    move-object v7, v10

    .line 337
    :cond_f
    :goto_9
    return-object v7

    .line 338
    :pswitch_3
    iget v0, v4, Lc2/g0;->f:I

    .line 339
    .line 340
    if-eqz v0, :cond_11

    .line 341
    .line 342
    if-ne v0, v11, :cond_10

    .line 343
    .line 344
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 349
    .line 350
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_11
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    check-cast v3, Li3/h;

    .line 358
    .line 359
    iget-object v0, v3, Li3/h;->a:Lb2/d;

    .line 360
    .line 361
    iput v11, v4, Lc2/g0;->f:I

    .line 362
    .line 363
    invoke-virtual {v0, v8, v9, v4}, Lb2/d;->b(JLac/c;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-ne v0, v10, :cond_12

    .line 368
    .line 369
    move-object v7, v10

    .line 370
    :cond_12
    :goto_a
    return-object v7

    .line 371
    :pswitch_4
    iget v0, v4, Lc2/g0;->f:I

    .line 372
    .line 373
    if-eqz v0, :cond_14

    .line 374
    .line 375
    if-ne v0, v11, :cond_13

    .line 376
    .line 377
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto :goto_b

    .line 381
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 382
    .line 383
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v0

    .line 387
    :cond_14
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    check-cast v3, Lx0/w0;

    .line 391
    .line 392
    iput v11, v4, Lc2/g0;->f:I

    .line 393
    .line 394
    invoke-static {v8, v9, v3, v1, v4}, Lda/a;->l(JLx0/w0;ZLac/c;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-ne v0, v10, :cond_15

    .line 399
    .line 400
    move-object v7, v10

    .line 401
    :cond_15
    :goto_b
    return-object v7

    .line 402
    :pswitch_5
    iget v0, v4, Lc2/g0;->f:I

    .line 403
    .line 404
    const-wide/16 v12, 0x8

    .line 405
    .line 406
    if-eqz v0, :cond_18

    .line 407
    .line 408
    if-eq v0, v11, :cond_17

    .line 409
    .line 410
    if-ne v0, v2, :cond_16

    .line 411
    .line 412
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    goto :goto_e

    .line 416
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 417
    .line 418
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v0

    .line 422
    :cond_17
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    goto :goto_c

    .line 426
    :cond_18
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    sub-long v0, v8, v12

    .line 430
    .line 431
    iput v11, v4, Lc2/g0;->f:I

    .line 432
    .line 433
    invoke-static {v0, v1, v4}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    if-ne v0, v10, :cond_19

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_19
    :goto_c
    iput v2, v4, Lc2/g0;->f:I

    .line 441
    .line 442
    invoke-static {v12, v13, v4}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-ne v0, v10, :cond_1a

    .line 447
    .line 448
    :goto_d
    move-object v7, v10

    .line 449
    goto :goto_f

    .line 450
    :cond_1a
    :goto_e
    check-cast v3, Lc2/i0;

    .line 451
    .line 452
    iget-object v0, v3, Lc2/i0;->c:Lhf/k;

    .line 453
    .line 454
    if-eqz v0, :cond_1b

    .line 455
    .line 456
    new-instance v1, Lc2/n;

    .line 457
    .line 458
    invoke-direct {v1, v8, v9}, Lc2/n;-><init>(J)V

    .line 459
    .line 460
    .line 461
    invoke-static {v1}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v0, v1}, Lhf/k;->h(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :cond_1b
    :goto_f
    return-object v7

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
