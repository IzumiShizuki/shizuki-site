.class public final Lu/a0;
.super Lac/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic c:I

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhf/y;Lic/o;Lic/k;Lu/i1;Lyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu/a0;->c:I

    .line 1
    iput-object p1, p0, Lu/a0;->g:Ljava/lang/Object;

    check-cast p2, Lac/i;

    iput-object p2, p0, Lu/a0;->h:Ljava/lang/Object;

    check-cast p3, Ljc/m;

    iput-object p3, p0, Lu/a0;->i:Ljava/lang/Object;

    iput-object p4, p0, Lu/a0;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljc/m;Ljc/m;Ljc/m;Ljc/m;Lyb/c;I)V
    .locals 0

    .line 2
    iput p6, p0, Lu/a0;->c:I

    iput-object p1, p0, Lu/a0;->g:Ljava/lang/Object;

    iput-object p2, p0, Lu/a0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lu/a0;->i:Ljava/lang/Object;

    iput-object p4, p0, Lu/a0;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;Lyb/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lu/a0;->c:I

    .line 3
    iput-object p1, p0, Lu/a0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lu/a0;->g:Ljava/lang/Object;

    iput-object p3, p0, Lu/a0;->h:Ljava/lang/Object;

    iput-object p4, p0, Lu/a0;->i:Ljava/lang/Object;

    iput-object p5, p0, Lu/a0;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 9

    .line 1
    iget v0, p0, Lu/a0;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lu/a0;

    .line 7
    .line 8
    iget-object v0, p0, Lu/a0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lx0/w0;

    .line 12
    .line 13
    iget-object v0, p0, Lu/a0;->g:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lx0/w0;

    .line 17
    .line 18
    iget-object v0, p0, Lu/a0;->h:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lx0/w0;

    .line 22
    .line 23
    iget-object v0, p0, Lu/a0;->i:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Lx0/w0;

    .line 27
    .line 28
    iget-object v0, p0, Lu/a0;->j:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v0

    .line 31
    check-cast v6, Lx0/w0;

    .line 32
    .line 33
    move-object v7, p2

    .line 34
    invoke-direct/range {v1 .. v7}, Lu/a0;-><init>(Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;Lyb/c;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v1, Lu/a0;->f:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_0
    move-object v7, p2

    .line 41
    new-instance v2, Lu/a0;

    .line 42
    .line 43
    iget-object p2, p0, Lu/a0;->g:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v3, p2

    .line 46
    check-cast v3, Lhf/y;

    .line 47
    .line 48
    iget-object p2, p0, Lu/a0;->h:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, p2

    .line 51
    check-cast v4, Lac/i;

    .line 52
    .line 53
    iget-object p2, p0, Lu/a0;->i:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v5, p2

    .line 56
    check-cast v5, Ljc/m;

    .line 57
    .line 58
    iget-object p2, p0, Lu/a0;->j:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v6, p2

    .line 61
    check-cast v6, Lu/i1;

    .line 62
    .line 63
    invoke-direct/range {v2 .. v7}, Lu/a0;-><init>(Lhf/y;Lic/o;Lic/k;Lu/i1;Lyb/c;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v2, Lu/a0;->f:Ljava/lang/Object;

    .line 67
    .line 68
    return-object v2

    .line 69
    :pswitch_1
    move-object v7, p2

    .line 70
    new-instance v2, Lu/a0;

    .line 71
    .line 72
    iget-object p2, p0, Lu/a0;->g:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v3, p2

    .line 75
    check-cast v3, Lcg/e;

    .line 76
    .line 77
    iget-object p2, p0, Lu/a0;->h:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v4, p2

    .line 80
    check-cast v4, La0/q;

    .line 81
    .line 82
    iget-object p2, p0, Lu/a0;->i:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v5, p2

    .line 85
    check-cast v5, Lcg/f;

    .line 86
    .line 87
    iget-object p2, p0, Lu/a0;->j:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, p2

    .line 90
    check-cast v6, Lcg/f;

    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    invoke-direct/range {v2 .. v8}, Lu/a0;-><init>(Ljc/m;Ljc/m;Ljc/m;Ljc/m;Lyb/c;I)V

    .line 94
    .line 95
    .line 96
    iput-object p1, v2, Lu/a0;->f:Ljava/lang/Object;

    .line 97
    .line 98
    return-object v2

    .line 99
    :pswitch_2
    move-object v7, p2

    .line 100
    new-instance v2, Lu/a0;

    .line 101
    .line 102
    iget-object p2, p0, Lu/a0;->g:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v3, p2

    .line 105
    check-cast v3, Lcg/b;

    .line 106
    .line 107
    iget-object p2, p0, Lu/a0;->h:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v4, p2

    .line 110
    check-cast v4, Lb0/p0;

    .line 111
    .line 112
    iget-object p2, p0, Lu/a0;->i:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v5, p2

    .line 115
    check-cast v5, Lcg/y;

    .line 116
    .line 117
    iget-object p2, p0, Lu/a0;->j:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v6, p2

    .line 120
    check-cast v6, Lcg/y;

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    invoke-direct/range {v2 .. v8}, Lu/a0;-><init>(Ljc/m;Ljc/m;Ljc/m;Ljc/m;Lyb/c;I)V

    .line 124
    .line 125
    .line 126
    iput-object p1, v2, Lu/a0;->f:Ljava/lang/Object;

    .line 127
    .line 128
    return-object v2

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lu/a0;->c:I

    .line 2
    .line 3
    check-cast p1, Lc2/i0;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lu/a0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lu/a0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lu/a0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu/a0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lu/a0;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lu/a0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lu/a0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lu/a0;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lu/a0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lu/a0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lu/a0;

    .line 54
    .line 55
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lu/a0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .locals 22

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Lu/a0;->c:I

    .line 4
    .line 5
    sget-object v1, Lc2/m;->b:Lc2/m;

    .line 6
    .line 7
    const/4 v6, 0x3

    .line 8
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v9, Lzb/a;->a:Lzb/a;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x0

    .line 17
    iget-object v10, v5, Lu/a0;->g:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v11, v5, Lu/a0;->h:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v12, v5, Lu/a0;->j:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v13, v5, Lu/a0;->i:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v14, 0x1

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v18, v12

    .line 30
    .line 31
    check-cast v18, Lx0/w0;

    .line 32
    .line 33
    move-object/from16 v16, v11

    .line 34
    .line 35
    check-cast v16, Lx0/w0;

    .line 36
    .line 37
    move-object v15, v10

    .line 38
    check-cast v15, Lx0/w0;

    .line 39
    .line 40
    iget-object v0, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lx0/w0;

    .line 43
    .line 44
    iget v6, v5, Lu/a0;->e:I

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-eq v6, v14, :cond_1

    .line 49
    .line 50
    if-ne v6, v3, :cond_0

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    iget-object v1, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lc2/i0;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v2, v1

    .line 70
    move-object/from16 v1, p1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lc2/i0;

    .line 79
    .line 80
    iput-object v2, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 81
    .line 82
    iput v14, v5, Lu/a0;->e:I

    .line 83
    .line 84
    sget-object v6, Lu/n2;->a:Li7/k;

    .line 85
    .line 86
    invoke-static {v2, v4, v1, v5}, Lu/n2;->b(Lc2/i0;ZLc2/m;Lyb/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v9, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_0
    check-cast v1, Lc2/t;

    .line 94
    .line 95
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-interface {v0, v4}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v17, v13

    .line 101
    .line 102
    check-cast v17, Lx0/w0;

    .line 103
    .line 104
    iget-wide v10, v1, Lc2/t;->c:J

    .line 105
    .line 106
    const/16 v21, 0x1

    .line 107
    .line 108
    move-wide/from16 v19, v10

    .line 109
    .line 110
    invoke-static/range {v15 .. v21}, Lua/i;->f(Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;JZ)V

    .line 111
    .line 112
    .line 113
    iget-wide v10, v1, Lc2/t;->a:J

    .line 114
    .line 115
    move-object/from16 v17, v16

    .line 116
    .line 117
    move-object/from16 v16, v15

    .line 118
    .line 119
    new-instance v15, Lb0/o0;

    .line 120
    .line 121
    check-cast v13, Lx0/w0;

    .line 122
    .line 123
    const/16 v20, 0x5

    .line 124
    .line 125
    move-object/from16 v19, v18

    .line 126
    .line 127
    move-object/from16 v18, v13

    .line 128
    .line 129
    invoke-direct/range {v15 .. v20}, Lb0/o0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    iput-object v8, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 133
    .line 134
    iput v3, v5, Lu/a0;->e:I

    .line 135
    .line 136
    invoke-static {v2, v10, v11, v15, v5}, Lu/e0;->g(Lc2/i0;JLic/k;Lac/a;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-ne v1, v9, :cond_4

    .line 141
    .line 142
    :goto_1
    move-object v7, v9

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-interface {v0, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    return-object v7

    .line 150
    :pswitch_0
    check-cast v10, Lhf/y;

    .line 151
    .line 152
    check-cast v12, Lu/i1;

    .line 153
    .line 154
    iget v0, v5, Lu/a0;->e:I

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    if-eq v0, v14, :cond_6

    .line 159
    .line 160
    if-ne v0, v3, :cond_5

    .line 161
    .line 162
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lhf/d1;

    .line 165
    .line 166
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object/from16 v1, p1

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_6
    iget-object v0, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lhf/r1;

    .line 181
    .line 182
    iget-object v2, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v2, Lc2/i0;

    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v6, p1

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v2, v0

    .line 198
    check-cast v2, Lc2/i0;

    .line 199
    .line 200
    sget-object v0, Lu/n2;->a:Li7/k;

    .line 201
    .line 202
    new-instance v0, Lu/i2;

    .line 203
    .line 204
    invoke-direct {v0, v12, v8, v4}, Lu/i2;-><init>(Lu/i1;Lyb/c;I)V

    .line 205
    .line 206
    .line 207
    sget-object v15, Lhf/z;->d:Lhf/z;

    .line 208
    .line 209
    invoke-static {v10, v8, v15, v0, v14}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v2, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v0, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 216
    .line 217
    iput v14, v5, Lu/a0;->e:I

    .line 218
    .line 219
    invoke-static {v2, v5, v6}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    if-ne v6, v9, :cond_8

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_8
    :goto_4
    check-cast v6, Lc2/t;

    .line 227
    .line 228
    invoke-virtual {v6}, Lc2/t;->a()V

    .line 229
    .line 230
    .line 231
    check-cast v11, Lac/i;

    .line 232
    .line 233
    sget-object v15, Lu/n2;->a:Li7/k;

    .line 234
    .line 235
    if-eq v11, v15, :cond_9

    .line 236
    .line 237
    new-instance v15, Lq/q;

    .line 238
    .line 239
    invoke-direct {v15, v11, v12, v6, v8}, Lq/q;-><init>(Lic/o;Lu/i1;Lc2/t;Lyb/c;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v10, v0, v15}, Lu/n2;->h(Lhf/y;Lhf/d1;Lic/n;)Lhf/r1;

    .line 243
    .line 244
    .line 245
    :cond_9
    iput-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v8, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 248
    .line 249
    iput v3, v5, Lu/a0;->e:I

    .line 250
    .line 251
    invoke-static {v2, v1, v5}, Lu/n2;->j(Lc2/i0;Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    if-ne v1, v9, :cond_a

    .line 256
    .line 257
    :goto_5
    move-object v7, v9

    .line 258
    goto :goto_7

    .line 259
    :cond_a
    :goto_6
    check-cast v1, Lc2/t;

    .line 260
    .line 261
    if-nez v1, :cond_b

    .line 262
    .line 263
    new-instance v1, Lu/h2;

    .line 264
    .line 265
    invoke-direct {v1, v12, v8, v4}, Lu/h2;-><init>(Lu/i1;Lyb/c;I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v10, v0, v1}, Lu/n2;->h(Lhf/y;Lhf/d1;Lic/n;)Lhf/r1;

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_b
    invoke-virtual {v1}, Lc2/t;->a()V

    .line 273
    .line 274
    .line 275
    new-instance v2, Lu/h2;

    .line 276
    .line 277
    invoke-direct {v2, v12, v8, v14}, Lu/h2;-><init>(Lu/i1;Lyb/c;I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v10, v0, v2}, Lu/n2;->h(Lhf/y;Lhf/d1;Lic/n;)Lhf/r1;

    .line 281
    .line 282
    .line 283
    check-cast v13, Ljc/m;

    .line 284
    .line 285
    iget-wide v0, v1, Lc2/t;->c:J

    .line 286
    .line 287
    new-instance v2, Lp1/b;

    .line 288
    .line 289
    invoke-direct {v2, v0, v1}, Lp1/b;-><init>(J)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v13, v2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    :goto_7
    return-object v7

    .line 296
    :pswitch_1
    check-cast v11, La0/q;

    .line 297
    .line 298
    iget v0, v5, Lu/a0;->e:I

    .line 299
    .line 300
    if-eqz v0, :cond_f

    .line 301
    .line 302
    if-eq v0, v14, :cond_e

    .line 303
    .line 304
    if-eq v0, v3, :cond_d

    .line 305
    .line 306
    if-ne v0, v6, :cond_c

    .line 307
    .line 308
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v0, p1

    .line 312
    .line 313
    move-object/from16 v17, v7

    .line 314
    .line 315
    goto/16 :goto_b

    .line 316
    .line 317
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 318
    .line 319
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :cond_d
    iget-object v0, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Ljc/v;

    .line 326
    .line 327
    iget-object v1, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v1, Lc2/i0;

    .line 330
    .line 331
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object v2, v1

    .line 335
    move-object/from16 v17, v7

    .line 336
    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_e
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Lc2/i0;

    .line 343
    .line 344
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v1, p1

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_f
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Lc2/i0;

    .line 356
    .line 357
    iput-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 358
    .line 359
    iput v14, v5, Lu/a0;->e:I

    .line 360
    .line 361
    invoke-static {v0, v5, v3}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    if-ne v1, v9, :cond_10

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_10
    :goto_8
    check-cast v1, Lc2/t;

    .line 369
    .line 370
    new-instance v15, Ljc/v;

    .line 371
    .line 372
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 373
    .line 374
    .line 375
    move-object/from16 v17, v7

    .line 376
    .line 377
    iget-wide v6, v1, Lc2/t;->a:J

    .line 378
    .line 379
    iget v1, v1, Lc2/t;->i:I

    .line 380
    .line 381
    new-instance v4, Lu/z;

    .line 382
    .line 383
    invoke-direct {v4, v15, v14}, Lu/z;-><init>(Ljc/v;I)V

    .line 384
    .line 385
    .line 386
    iput-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v15, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 389
    .line 390
    iput v3, v5, Lu/a0;->e:I

    .line 391
    .line 392
    move v3, v1

    .line 393
    move-wide v1, v6

    .line 394
    invoke-static/range {v0 .. v5}, Lu/e0;->e(Lc2/i0;JILu/z;Lac/a;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    if-ne v1, v9, :cond_11

    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_11
    move-object v2, v0

    .line 402
    move-object v0, v15

    .line 403
    :goto_9
    check-cast v1, Lc2/t;

    .line 404
    .line 405
    if-eqz v1, :cond_14

    .line 406
    .line 407
    check-cast v10, Lcg/e;

    .line 408
    .line 409
    iget-wide v3, v1, Lc2/t;->c:J

    .line 410
    .line 411
    new-instance v6, Lp1/b;

    .line 412
    .line 413
    invoke-direct {v6, v3, v4}, Lp1/b;-><init>(J)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v10, v6}, Lcg/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    iget v0, v0, Ljc/v;->a:F

    .line 420
    .line 421
    new-instance v3, Ljava/lang/Float;

    .line 422
    .line 423
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v11, v1, v3}, La0/q;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    iget-wide v0, v1, Lc2/t;->a:J

    .line 430
    .line 431
    new-instance v3, Lq/a0;

    .line 432
    .line 433
    const/16 v4, 0xc

    .line 434
    .line 435
    invoke-direct {v3, v4, v11}, Lq/a0;-><init>(ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    iput-object v8, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v8, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 441
    .line 442
    const/4 v4, 0x3

    .line 443
    iput v4, v5, Lu/a0;->e:I

    .line 444
    .line 445
    invoke-static {v2, v0, v1, v3, v5}, Lu/e0;->k(Lc2/i0;JLq/a0;Lac/a;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    if-ne v0, v9, :cond_12

    .line 450
    .line 451
    :goto_a
    move-object v7, v9

    .line 452
    goto :goto_d

    .line 453
    :cond_12
    :goto_b
    check-cast v0, Ljava/lang/Boolean;

    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-eqz v0, :cond_13

    .line 460
    .line 461
    check-cast v13, Lcg/f;

    .line 462
    .line 463
    invoke-virtual {v13}, Lcg/f;->b()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_13
    check-cast v12, Lcg/f;

    .line 468
    .line 469
    invoke-virtual {v12}, Lcg/f;->b()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    :cond_14
    :goto_c
    move-object/from16 v7, v17

    .line 473
    .line 474
    :goto_d
    return-object v7

    .line 475
    :pswitch_2
    move-object/from16 v17, v7

    .line 476
    .line 477
    check-cast v11, Lb0/p0;

    .line 478
    .line 479
    iget v0, v5, Lu/a0;->e:I

    .line 480
    .line 481
    if-eqz v0, :cond_18

    .line 482
    .line 483
    if-eq v0, v14, :cond_17

    .line 484
    .line 485
    if-eq v0, v3, :cond_16

    .line 486
    .line 487
    const/4 v4, 0x3

    .line 488
    if-ne v0, v4, :cond_15

    .line 489
    .line 490
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    move-object/from16 v0, p1

    .line 494
    .line 495
    goto/16 :goto_11

    .line 496
    .line 497
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 498
    .line 499
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    throw v0

    .line 503
    :cond_16
    iget-object v0, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Ljc/v;

    .line 506
    .line 507
    iget-object v1, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v1, Lc2/i0;

    .line 510
    .line 511
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    move-object v2, v1

    .line 515
    move-object/from16 v1, p1

    .line 516
    .line 517
    goto :goto_f

    .line 518
    :cond_17
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v0, Lc2/i0;

    .line 521
    .line 522
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    move-object/from16 v1, p1

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_18
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    iget-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Lc2/i0;

    .line 534
    .line 535
    iput-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 536
    .line 537
    iput v14, v5, Lu/a0;->e:I

    .line 538
    .line 539
    invoke-static {v0, v5, v3}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    if-ne v1, v9, :cond_19

    .line 544
    .line 545
    goto :goto_10

    .line 546
    :cond_19
    :goto_e
    check-cast v1, Lc2/t;

    .line 547
    .line 548
    new-instance v6, Ljc/v;

    .line 549
    .line 550
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 551
    .line 552
    .line 553
    iget-wide v14, v1, Lc2/t;->a:J

    .line 554
    .line 555
    iget v1, v1, Lc2/t;->i:I

    .line 556
    .line 557
    new-instance v2, Lu/z;

    .line 558
    .line 559
    invoke-direct {v2, v6, v4}, Lu/z;-><init>(Ljc/v;I)V

    .line 560
    .line 561
    .line 562
    iput-object v0, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 563
    .line 564
    iput-object v6, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 565
    .line 566
    iput v3, v5, Lu/a0;->e:I

    .line 567
    .line 568
    move v3, v1

    .line 569
    move-object v4, v2

    .line 570
    move-wide v1, v14

    .line 571
    invoke-static/range {v0 .. v5}, Lu/e0;->c(Lc2/i0;JILu/z;Lac/a;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    if-ne v1, v9, :cond_1a

    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_1a
    move-object v2, v0

    .line 579
    move-object v0, v6

    .line 580
    :goto_f
    check-cast v1, Lc2/t;

    .line 581
    .line 582
    if-eqz v1, :cond_1d

    .line 583
    .line 584
    check-cast v10, Lcg/b;

    .line 585
    .line 586
    const-string v3, "onDragStart"

    .line 587
    .line 588
    const-string v4, "GestureController"

    .line 589
    .line 590
    invoke-static {v3, v4}, Lg8/a;->T(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    iget-object v3, v10, Lcg/b;->c:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v3, Ljc/x;

    .line 596
    .line 597
    iget-object v4, v10, Lcg/b;->d:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v4, Lcg/v;

    .line 600
    .line 601
    iget-object v4, v4, Lcg/v;->j:Lx0/e1;

    .line 602
    .line 603
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    check-cast v4, Ljava/lang/Number;

    .line 608
    .line 609
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 610
    .line 611
    .line 612
    move-result-wide v6

    .line 613
    iput-wide v6, v3, Ljc/x;->a:J

    .line 614
    .line 615
    iget-object v3, v10, Lcg/b;->e:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v3, Ljc/v;

    .line 618
    .line 619
    const/4 v4, 0x0

    .line 620
    iput v4, v3, Ljc/v;->a:F

    .line 621
    .line 622
    iget v0, v0, Ljc/v;->a:F

    .line 623
    .line 624
    new-instance v3, Ljava/lang/Float;

    .line 625
    .line 626
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v11, v1, v3}, Lb0/p0;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    iget-wide v0, v1, Lc2/t;->a:J

    .line 633
    .line 634
    new-instance v3, Lq/a0;

    .line 635
    .line 636
    const/16 v4, 0xb

    .line 637
    .line 638
    invoke-direct {v3, v4, v11}, Lq/a0;-><init>(ILjava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    iput-object v8, v5, Lu/a0;->f:Ljava/lang/Object;

    .line 642
    .line 643
    iput-object v8, v5, Lu/a0;->d:Ljava/lang/Object;

    .line 644
    .line 645
    const/4 v4, 0x3

    .line 646
    iput v4, v5, Lu/a0;->e:I

    .line 647
    .line 648
    invoke-static {v2, v0, v1, v3, v5}, Lu/e0;->h(Lc2/i0;JLq/a0;Lac/a;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-ne v0, v9, :cond_1b

    .line 653
    .line 654
    :goto_10
    move-object v7, v9

    .line 655
    goto :goto_13

    .line 656
    :cond_1b
    :goto_11
    check-cast v0, Ljava/lang/Boolean;

    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_1c

    .line 663
    .line 664
    check-cast v13, Lcg/y;

    .line 665
    .line 666
    invoke-virtual {v13}, Lcg/y;->b()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    goto :goto_12

    .line 670
    :cond_1c
    check-cast v12, Lcg/y;

    .line 671
    .line 672
    invoke-virtual {v12}, Lcg/y;->b()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    :cond_1d
    :goto_12
    move-object/from16 v7, v17

    .line 676
    .line 677
    :goto_13
    return-object v7

    .line 678
    nop

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
